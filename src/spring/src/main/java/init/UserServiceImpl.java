package init;

import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-06-18
 */
@Component
public class UserServiceImpl {
    private String name;


    public void setName(String name) {
        this.name = name;
    }
}
