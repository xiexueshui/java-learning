/**
 * @auther xxs
 * @date 2021-04-08
 */
public class HungryMode {
    // 单例模式 饿汉模式 可能会浪费内存

    // 1.构造器私有化
    private HungryMode(){

    }

    // 2、本地创建一个实例
    private final static HungryMode instance = new HungryMode();

    // 提供一个共有的静态方法·，返回实例对象
    public static HungryMode getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        HungryMode instance = HungryMode.getInstance();
        HungryMode instance2 = HungryMode.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

