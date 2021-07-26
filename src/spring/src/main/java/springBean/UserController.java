package springBean;

import java.lang.reflect.Field;

/**
 * @auther xxs
 * @date 2021-05-18
 */
public class UserController {
    /**
     * 声明一个变量没有赋值，spring中通过@Autowired注入赋值
     * 1.通过new 赋值 new UserService()
     * 2.反射
     * public UserController(){
     * Class<UserService> userServiceClass = UserService.class;
     * try {
     * userService = userServiceClass.newInstance();
     * } catch (InstantiationException e) {
     * e.printStackTrace();
     * } catch (IllegalAccessException e) {
     * e.printStackTrace();
     * }
     * }
     * <p>
     * 通过反射自己实现@Autowired
     */
    @Autowired
    private UserService userService;


    public static void main(String[] args) {
        UserController userController = new UserController();
        Field[] fields = userController.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(Autowired.class) != null) {
                Class<?> aClass = field.getType();
                try {
                    Object o = aClass.newInstance();
                    field.set(userController, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        userController.userService.show();
    }

}
