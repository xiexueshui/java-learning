import aop.UserService;
import helloSpring.javaConfig.Dog;
import helloSpring.javaConfig.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xxs
 * @date 2021-05-13
 */
@Configuration
public class aopText {
    public static void main(String[] args) {
        //java配置生成springbean
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        UserService UserService = context.getBean("getUserService", UserService.class);
        UserService.add();
        UserService.delete();
    }
}
