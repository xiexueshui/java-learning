import helloSpring.javaConfig.Dog;
import helloSpring.javaConfig.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xxs
 * @date 2021-05-12
 */
public class javaConfigText {
    public static void main(String[] args) {
        //java配置生成springbean
       ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(config.class);
        Dog dog = annotationConfigApplicationContext.getBean("getDog", Dog.class);
        System.out.println(dog.getName());
    }
}
