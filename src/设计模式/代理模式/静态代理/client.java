package 代理模式.静态代理;

/**
 * @auther xxs
 * @date 2021-05-13
 */
public class client {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        ProxyBuyHouse buyHouseProxy = new ProxyBuyHouse();
        buyHouseProxy.setBuyHouse(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
