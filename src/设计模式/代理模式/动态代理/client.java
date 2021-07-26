package 代理模式.动态代理;

import 代理模式.静态代理.BuyHouse;

import java.lang.reflect.Proxy;

/**
 * @auther xxs
 * @date 2021-05-13
 */
public class client {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setObject(buyHouse);
        BuyHouse proxy = (BuyHouse) proxyHandler.getProxy();
        proxy.buyHouse();
    }
}
