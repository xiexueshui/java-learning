package 依赖注入;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @auther xxs
 * @date 2021-06-28
 */
@Component
public class A {
    public B b;

    public A() {

    }

    @Autowired(required = false)  //Autowired放在方法上，参数会自动注入spring的 bean 先byType 后 byName
    public void text(B b){
        System.out.println("Autowired放在方法上");
        this.b = b;
    }

    @Autowired(required = true) //Autowired放在构造方法上，参数会自动注入spring的 bean 先byType 后 byName
    public A(B b){
        System.out.println("Autowired放在构造方法上");
        this.b = b;
    }
}
