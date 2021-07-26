package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @auther xxs
 * @date 2021-07-07
 */

public class main {
    public static void main(String[] args) throws IOException {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);

        AbstractBeanDefinition  beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(XFactoryBean.class);
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserService.class);
        context.registerBeanDefinition("user",beanDefinition);




        System.out.println(context.getBean("user"));
        System.out.println(context.getBean("&user"));

    }
}
