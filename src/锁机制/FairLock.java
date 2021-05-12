import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther xxs
 * @date 2021-04-28
 */
public class FairLock implements Runnable{
    // 公平锁：多个线程请求锁的时候是按照先后顺序获取锁的
    // 非公平锁:多个线程请求锁不是按照先后顺序获取的

    // ReentrantLock 默认是非公平的 可以设置为公平锁  Sychorinized是非公平锁

    ReentrantLock reentrantLock = new ReentrantLock(false);
    Integer i = 100;
    public static void main(String[] args) {

        FairLock fairLock = new FairLock();
        for (int i = 0; i < 100; i++) {
            new Thread(fairLock).start();

        }
    }

    @Override
    public void run() {
        reentrantLock.lock();
        try{
            i--;
            System.out.println("线程名："+Thread.currentThread().getName()+"  i的值是："+i);
        }catch (Exception e){

        }finally {
            reentrantLock.unlock();
        }

    }
}
