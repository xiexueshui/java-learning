import java.util.Iterator;

/**
 * @auther xxs
 * @date 2021-05-19
 */
public class intfImpl implements intf{
    @Override
    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {
        intf i = new intfImpl();
        i.setName("1");

    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
