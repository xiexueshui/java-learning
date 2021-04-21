import java.util.concurrent.*;

/**
 * @auther xxs
 * @date 2021-03-26
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,12,3L, TimeUnit.SECONDS,new ArrayBlockingQueue<>(8));

        for (int i = 0; i < 20; i++) {
            executorService.submit(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }

}
