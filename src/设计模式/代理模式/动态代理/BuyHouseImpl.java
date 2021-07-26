package 代理模式.动态代理;

import 代理模式.静态代理.BuyHouse;

/**
 * @auther xxs
 * @date 2021-05-13
 */
public class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }
}
