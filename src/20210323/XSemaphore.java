import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author 76803
 */
public class XSemaphore {
    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(3); //起一个限流作用
        new Thread(()->{
            try {
                semaphore.acquire();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();
        new Thread(()->{
            try {
                semaphore.acquire();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();
        new Thread(()->{
            try {
                semaphore.acquire();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();
        new Thread(()->{
            try {
                semaphore.acquire();
                TimeUnit.SECONDS.sleep(3);
                System.out.println("4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }).start();
    }
}
