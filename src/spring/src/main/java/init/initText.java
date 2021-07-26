package init;

import init.init;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xxs
 * @date 2021-06-17
 */
public class initText {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
        // 通过spring 产生一个init 对象
        // spring默认调用init的无参构造函数创建对象，此时init的userService为空？
        // 实例化 -》填充属性 =》初始化 =》aop =>proxy=> 对象  ！ aop是通过代理来实现会生成一个代理对象proxy不是原本对象
        init init = context.getBean("init", init.class);

        //开启aop输出的是空，不开启是对象；开启时是将代理对象赋给bean
        System.out.println(init.userService);
        System.out.println(init.getUserService());
    }
}
