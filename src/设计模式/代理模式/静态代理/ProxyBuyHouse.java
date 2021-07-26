package 代理模式.静态代理;

/**
 * @auther xxs
 * @date 2021-05-13
 */
public class ProxyBuyHouse implements BuyHouse {
    private BuyHouse buyHouse;

    public void setBuyHouse(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        this.buyHouse.buyHouse();
        System.out.println("买房后装修");

    }
}
