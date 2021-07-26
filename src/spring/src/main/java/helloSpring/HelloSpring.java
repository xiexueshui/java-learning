package helloSpring;

import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-05-11
 */
// @Component
public class HelloSpring {
    private String name;
    private String code;

    public HelloSpring() {
        System.out.println("无参构造");
    }

    public HelloSpring(String name, String code) {
        this.name = name;
        this.code = code;
        System.out.println("有参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void show() {
        System.out.println("name: " + name + "   code: " + code);
    }
}
