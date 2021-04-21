import java.util.concurrent.CountDownLatch;

/**
 * @author 76803
 */
public class XCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
       final  CountDownLatch countDownLatch = new CountDownLatch(9);
        for ( int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println("线程： "+Thread.currentThread().getName());
                countDownLatch.countDown();
            }).start();
          //  System.out.println(countDownLatch.getCount());
        }
        countDownLatch.await();
        System.out.println("close");

    }
}
