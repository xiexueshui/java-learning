package helloSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-05-12
 */
//@Component
public class Cat {
    @Value("cc")
    private String name;

    public String getName() {
        return name;
    }
}
