package ioc.service;

import ioc.dao.UserDao;

/**
 * @auther xxs
 * @date 2021-05-07
 */
public class userServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
