import helloSpring.SpringAnnotation;
import helloSpring.SpringAutowire;
import helloSpring.SpringAutowireAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xxs
 * @date 2021-05-12
 */
public class SpringAutowireTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SpringAutowire springAutowire = context.getBean("helloByName", SpringAutowire.class);
        springAutowire.getHelloSpring().show();



        SpringAutowireAnnotation springAutowireAnnotation =context.getBean("hello", SpringAutowireAnnotation.class);
        springAutowireAnnotation.getHelloSpring().show();
        springAutowireAnnotation.getSpringAutowire().getHelloSpring().show();


        SpringAnnotation springAnnotation =context.getBean("SpringAnnotation", SpringAnnotation.class);
        System.out.println(  springAnnotation.getCat().getName());

    }

}
