package aop;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @auther xxs
 * @date 2021-05-13
 */

public class afterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"执行了"+method+" 返回值为"+o);
    }


}
