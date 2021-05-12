

import ioc.dao.AuserDaoImpl;
import ioc.dao.BuserDaoImpl;
import ioc.dao.UserDao;
import ioc.service.userServiceImpl;

/**
 * @auther xxs
 * @date 2021-05-10
 */
public class UserTest {
    public static void main(String[] args) {
        userServiceImpl userService = new userServiceImpl();
        AuserDaoImpl auserDao = new AuserDaoImpl();
        userService.setUserDao(auserDao);
        userService.getUser();

        // 将创建对象的工作给调用者，原本对象的创建是由程序员自己创建，控制反转可以理解为创建对象的方式反转了，原本由核心程序创建反转为第三方创建
        UserDao buserDao = new BuserDaoImpl();
        userService.setUserDao(buserDao);
        userService.getUser();
    }
}
