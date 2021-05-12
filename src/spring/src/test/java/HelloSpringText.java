import helloSpring.HelloSpring;
import helloSpring.SpringAutowireAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xxs
 * @date 2021-05-11
 */
public class HelloSpringText {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 通过spring框架来创建对象  无参构造
        HelloSpring hellwSpring = (HelloSpring) context.getBean("hellwSpring0");
        hellwSpring.show();
        // 通过spring框架来创建对象 有参构造
        HelloSpring hellwSpring2 = (HelloSpring) context.getBean("hellwSpring1");
        hellwSpring2.show();
        // 结论：对象在加载xml文件时就已经创建。

        //alias 别名
        HelloSpring helloAlias = (HelloSpring) context.getBean("hello0");
        helloAlias.show();

        //import
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans2.xml");
        HelloSpring helloImport = (HelloSpring) context2.getBean("hello0");
        helloImport.show();

        //原型模式
        HelloSpring helloPrototype = (HelloSpring) context.getBean("prototype");
        HelloSpring helloPrototype2 = (HelloSpring) context.getBean("prototype");
        System.out.println("helloPrototype"+helloPrototype.hashCode()+"   helloPrototype2"+helloPrototype2.hashCode());


    }






}
