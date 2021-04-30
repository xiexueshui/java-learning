/**
 * @auther xxs
 * @date 2021-04-30
 */
public class RLock implements Runnable {
    // 可重入锁：当一个线程获取一个方法的锁，能获取他内层方法的锁  synchronized与ReentrantLock都是可重入锁

    volatile Boolean flag = false;
    @Override
    public void run() {
        try {
            if(flag){
                flag = !flag;
                setA();
            }else {
                flag = !flag;
                setB();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    synchronized void setA() throws Exception {
        System.out.println("setA: "+Thread.currentThread().getName());
        Thread.sleep(10000);
        setB();   // 因为获取了setA()的锁（即获取了方法外层的锁）、此时调用setB()将会自动获取setB()的锁，如果不自动获取的话方法B将不会执行
    }

    synchronized void setB() throws Exception {
        System.out.println("setB: "+Thread.currentThread().getName());
        Thread.sleep(1000);


    }
    public static void main(String[] args) {
        RLock rLock = new RLock();
        new Thread(rLock).start();
        new Thread(rLock).start();
        new Thread(rLock).start();
    }
}

