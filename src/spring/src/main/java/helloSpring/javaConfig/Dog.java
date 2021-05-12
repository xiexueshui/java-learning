package helloSpring.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-05-12
 */
@Component
public class Dog {
    @Value("DD")
    private String name;

    public String getName() {
        return name;
    }
}
