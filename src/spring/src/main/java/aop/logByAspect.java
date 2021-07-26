package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @auther xxs
 * @date 2021-05-14
 */
@Aspect
public class logByAspect {

    @Before("execution(* aop.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("执行开始前-------------");
    }


    @After("execution(* aop.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行结束后-------------");
    }



}
