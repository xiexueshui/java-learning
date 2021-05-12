package helloSpring;

/**
 * @auther xxs
 * @date 2021-05-12
 */
public class SpringAutowire {

    public SpringAutowire(){
        System.out.println("自动装配");
    }

    private HelloSpring helloSpring;

    public HelloSpring getHelloSpring() {
        return helloSpring;
    }

    public void setHellwSpring1(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }
    // spring自动装配  xml设置autowire="byName"  类里设置set方法就会将set的name自动装配到里面
}
