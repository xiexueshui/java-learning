import helloSpring.HelloSpring;
import org.springframework.aop.ProxyMethodInvocation;


import java.lang.reflect.*;

/**
 * @auther xxs
 * @date 2021-05-17
 */
public class singleton {
    /**
     * 单例模式 只产生一个实例
     */

    /**
     * 饿汉模式 可能会浪费内存
     */
//    private singleton(){}
//
//    private final static instance = new singleton();
//
//    public singleton getInstance(){
//        return instance;
//    }
//


    /**
     * 懒汉模式  效率比较低
     */
//    private singleton(){}
//
//    private  static singleton instance ;
//
//    public synchronized singleton getInstance(){
//        if(instance==null){
//            instance = new singleton();
//        }
//        return instance;
//    }

    /**
     * 双重检查
     */

//    private singleton(){}
//    private volatile   static singleton instance ;
//    public  singleton getInstance(){
//        if(instance==null){
//            synchronized(instance){
//                if(instance==null){
//                    instance = new singleton();
//                }
//            }
//
//        }
//        return instance;
//    }
    /**
     * 代理模式 - 代理类，可以在原有的类上新增功能
     */
    /**
     * 静态代理
     */
//    interface get{
//        void getOne();
//    }
//    static class getImpl implements get{
//
//        @Override
//        public void getOne() {
//            System.out.println("getOne is ok");
//        }
//    }
//
//    static class proxy implements  get{
//        private getImpl get;
//        private  proxy(getImpl get){
//            this.get = get;
//        }
//        @Override
//        public void getOne() {
//            System.out.println("getOne is ready");
//            get.getOne();
//            System.out.println("getOne is over");
//        }
//    }
//
//    public static void main(String[] args) {
//        getImpl get = new singleton.getImpl();
//        new proxy(get).getOne();
//    }
    /**
     * 动态代理
     */
//   static class DymaticProxy implements InvocationHandler {
//
//        private Object object;
//
//        public void setObject(Object object) {
//            this.object = object;
//        }
//
//
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            System.out.println("get is ready");
//            Object invoke = method.invoke(object, args);
//            return invoke;
//        }
//
//        public Object getInstance(){
//         return    Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
//        }
//    }
//    interface get{
//        void getOne();
//    }
//    static class getImpl implements get{
//
//        @Override
//        public void getOne() {
//            System.out.println("getOne is ok");
//        }
//    }
//
//    public static void main(String[] args) {
//        getImpl get = new getImpl();
//        DymaticProxy proxy=new DymaticProxy();
//        proxy.setObject(get);
//        get instance = (singleton.get) proxy.getInstance();
//        instance.getOne();
//
//
//    }

    /**
     * 反射
     */
    public static void main(String[] args) {
        Class<? extends HelloSpring> helloSpringClass =  HelloSpring.class;
        try {
            Constructor<? extends HelloSpring> constructor = helloSpringClass.getConstructor(String.class, String.class);
            HelloSpring helloSpring = constructor.newInstance("1", "2");
            helloSpring.show();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
