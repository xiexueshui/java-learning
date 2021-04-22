import javax.xml.soap.Text;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static javafx.scene.input.KeyCode.T;

/**
 * @auther xxs
 * @date 2021-04-15
 */
public class PessimisticLock implements Runnable {
    // 一个线程拿到锁后都会禁止其他线程拿到锁
    //  synchronized ,ReentrantLock都是悲观锁

    Flag flag;

    public PessimisticLock(Flag flag) {
        this.flag = flag;
    }

    public void text(Flag flag) {
        for (int i = 0; i < 1000; i++) {
            flag.add1();
        }
        System.out.println(Thread.currentThread().getName() + "  :  " + flag.flag);

    }

    public static void main(String[] args) {
        Flag a = new Flag();
        new Thread(new PessimisticLock(a)).start();
        new Thread(new PessimisticLock(a)).start();
        new Thread(new PessimisticLock(a)).start();
        new Thread(new PessimisticLock(a)).start();
        new Thread(new PessimisticLock(a)).start();
        //

    }

    @Override
    public void run() {
        this.text(flag);
    }
}



