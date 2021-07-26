public interface intf extends Iterable {


    /**
     * 接口变量都是final static
     */
    final static String name = null;

    /**
     * 接口方法都是抽象的 abstract
     */
    void show();

    /**
     * 在jdk1.8后 接口也可以实现定义的方法的 需要加default
     * @param name
     */
    default void setName(String name) {
        System.out.println("final can not  be set");

    }

    abstract class a {

    }
}
