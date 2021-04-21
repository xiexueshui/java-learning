import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 76803
 */
public class CallAble {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new text());
        new Thread(futureTask).start();

        Map<String,String> map = (Map<String, String>) futureTask.get();
        System.out.println(map.get("1"));
    }
}

class text implements Callable<Map<String,String>>{

    @Override
    public Map<String,String> call() throws Exception {
        System.out.println("call");
        Map<String, String>map =  new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        return map;
    }
}
