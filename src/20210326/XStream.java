import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * @auther xxs
 * @date 2021-03-26
 */
public class XStream {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add(UUID.randomUUID().toString());
        list.stream().filter(e->{ return e.isEmpty();});
        list.stream().filter(String::isEmpty);
    }

}
