// 解决生产者消费者问题 ——————  管程法


import java.util.UUID;

public class XGuanCheng {
    public static void main(String[] args) {
        GoodBuy goodBuy = new GoodBuy();
        new Thread(new Producer(goodBuy)).start();
        new Thread(new Customer(goodBuy)).start();
    }
}

//生产者线程
class Producer implements Runnable {
    GoodBuy goodBuy ;
    public Producer(GoodBuy goodBuy){
        this.goodBuy =goodBuy;
    }
    @Override
    public void run() {
        while (true){
            Goods goods = new Goods();
            goods.id = UUID.randomUUID().toString();
            this.goodBuy.push(goods);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


//消费者线程
class Customer implements Runnable {
    GoodBuy goodBuy ;
    public Customer(GoodBuy goodBuy){
        this.goodBuy =goodBuy;
    }
    @Override
    public void run() {
        while (true){
            this.goodBuy.pop();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


// 购买商品
class GoodBuy {
    Goods[] goods = new Goods[10];
    Integer length = 0;

    public GoodBuy(Goods[] goods) {
        this.goods = goods;
    }
    public GoodBuy() {

    }

    //在线线程中调用wait方法的时候 要用synchronized锁住对象，确保代码段不会被多个线程调用
    public synchronized void push(Goods goods) {
        if (length == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.goods[length] = goods;
            System.out.println("放入商品" + goods.id + "  仓库里有" + ++length + "个商品");
            this.notifyAll();
        }
    }

    public  synchronized void pop() {
        if (length <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("消费商品" + "  仓库里有" + --length + "个商品");
            notifyAll();
        }
    }
}

//商品
class Goods {
    String id;
}
