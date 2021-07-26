package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @auther xxs
 * @date 2021-05-13
 */
public class ProxyHandler implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object invoke = method.invoke(object, args);
        System.out.println("买房后装修");
        return invoke;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                object.getClass().getInterfaces(), this);
    }


}
