package 依赖注入;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther xxs
 * @date 2021-06-28
 */
@Configuration
@ComponentScan({"依赖注入"})
public class bean {

    @Bean
    public A getA(){
        return new A();
    }

    @Bean
    public B getB(){
        return new B();
    }
}
