package 依赖注入;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xxs
 * @date 2021-06-28
 */
public class main {
    public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(bean.class);
        A a = context.getBean("a", A.class);
        System.out.println(a.b);

    }
}
