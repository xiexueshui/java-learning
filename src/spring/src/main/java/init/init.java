package init;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import springBean.Autowired;

import javax.annotation.PostConstruct;

/**
 * @auther xxs
 * @date 2021-06-17
 */
@Component
public class init {



    public UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public  init(UserServiceImpl userService) {
        this.userService = userService;
    }

    //    public init(UserServiceImpl userService){
//        this.userService = userService;
//    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("--------------InitializingBean--------------");
//    }

    @PostConstruct
    public void init() {
        System.out.println("-------------postConstruct------------------");
    }


    public void text() {
        System.out.println(userService);
    }

}
