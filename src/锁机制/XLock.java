import java.util.concurrent.locks.ReentrantLock;

public class XLock implements Runnable{
    Integer num = 20;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try{
                if(num <=0) break;
                else {
                    num --;
                    System.out.println("还剩 "+num+"张票");
                }
            }finally {
                lock.unlock();
            }

        }

    }

    public static void main(String[] args) {
        XLock xLock = new XLock();
        new Thread(xLock).start();
        new Thread(xLock).start();
        new Thread(xLock).start();
    }
}
