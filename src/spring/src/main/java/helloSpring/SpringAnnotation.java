package helloSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-05-12
 */

public class SpringAnnotation {
    @Autowired
    private Cat cat;

    public Cat getCat() {
        return cat;
    }


}
