package helloSpring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther xxs
 * @date 2021-05-12
 */

/**
 * @Configuration相当于xml文件
 * @ComponentScan相当于  <context:annotation-config/>
 *  @Bean相当于<bean></bean>
 */
@Configuration
@ComponentScan("helloSpring.javaConfig")
public class config {

    /**
     * 方法名相当于 xml的bean的name属性
     * 返回值相当于 class属性
     * @return
     */
    @Bean
    public Dog getDog(){
        return new Dog();
    }
}
