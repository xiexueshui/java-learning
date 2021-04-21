/**
 * @author 76803
 */
public class BaSuo {

    public static void main(String[] args) {
        Syn syn = new Syn();
        Syn syn2 = new Syn();

        new Thread(()->{ syn.text(); }).start();
        new Thread(()->{ syn2.text2(); }).start();


//        new Thread(()->{
//            // 这个时候锁的是对象syn
//            Syn syn = new Syn();
//            Syn syn2 = new Syn();
//            syn.text();
//
//            syn2.text2();
//        }).start();

    }


}

    class  Syn{

    // 锁的是Syn类
    public static synchronized  void text(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("text--------1");
    }
    public synchronized void text2(){
        System.out.println("text2--------2");
    }
    public void text3(){
        System.out.println("text3--------3");
    }

}
