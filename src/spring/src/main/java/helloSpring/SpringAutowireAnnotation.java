package helloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @auther xxs
 * @date 2021-05-12
 */
public class SpringAutowireAnnotation {

    @Autowired
    @Qualifier(value = "helloSpring")
    private HelloSpring helloSpring;
    @Resource
    private SpringAutowire springAutowire;
    public HelloSpring getHelloSpring() {
        return helloSpring;
    }

    public SpringAutowire getSpringAutowire() {
        return springAutowire;
    }
}
