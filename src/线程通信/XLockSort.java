import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 76803
 */
public class XLockSort {

    public static void main(String[] args) {
        LockSort lockSort = new LockSort();
        new Thread(()->{
            while(true){
                lockSort.add();
            }}).start();
        new Thread(()->{
            while(true){
                lockSort.add2();
            }}).start();
        new Thread(()->{
            while(true){
                lockSort.add3();
            }}).start();


    }
}

class LockSort{
    Integer flag = 1;
    Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();


    public void add(){
        lock.lock();
        try {
            while (flag != 1){
                condition.await(); // 等待
            }
            System.out.println("1111111111111111111");
            flag = 2;
            condition2.signal(); // 将2唤醒

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void add2(){
        lock.lock();
        try {
            while (flag != 2){
                condition2.await(); // 等待
            }
            System.out.println("2222222222222222222");
            flag = 3;
            condition3.signal(); // 将3唤醒

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void add3(){
        lock.lock();
        try {
            while (flag != 3){
                condition3.await(); // 等待
            }
            System.out.println("333333333333333333333");
            flag = 1;
            condition.signal(); // 将1唤醒

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


}



