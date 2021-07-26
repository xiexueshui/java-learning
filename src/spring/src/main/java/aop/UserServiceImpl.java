package aop;

import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-05-13
 */

public class UserServiceImpl implements UserService{

    @Override
    public String add() {
        System.out.println("add");
        return "ADD";
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }
}
