import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 76803
 */
public class XReadWriteLock {
    public static void main(String[] args) {
        Container container = new Container();


        for (int i = 0; i < 5; i++) {
            final int temp2 = i;
            new Thread(()->{
                container.put(String.valueOf(temp2));
            }).start();
        }
        for (int i = 0; i < 3; i++) {
            final int temp = i;
            new Thread(()->{
                container.get((temp));
            }).start();
        }
    }

}
class Container{
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock writeLock = readWriteLock.writeLock();
    Lock readLock = readWriteLock.readLock();
    List list = new LinkedList();
    public void put(String food){
         writeLock.lock();
        try {
            TimeUnit.SECONDS.sleep(1);
            list.add(food);
            System.out.println("写入 "+food);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writeLock.unlock();
        }
    }
    public String get(Integer key){
        String s = null;
        readLock.lock();
        try {
            TimeUnit.SECONDS.sleep(1);
            s = UUID.randomUUID().toString();
            System.out.println("读取 "+  s);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            readLock.unlock();
        }
        return s;
    }
}
