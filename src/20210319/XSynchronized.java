import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class XSynchronized implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        Map<String,String> map = new HashMap<String,String>();
        List list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                    synchronized (map){
                        map.put(Thread.currentThread().getName(),Thread.currentThread().getName());
                    }

                }).start();
        }
        Thread.sleep(3000);
        System.out.println(map.size());
    }
}
