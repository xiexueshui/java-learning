package init;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @auther xxs
 * @date 2021-06-18
 */
@Aspect
@Component
public class initAop {

    @Before("execution(* init.*(..))")
    public void before(){
        System.out.println("-----init before---------");
    }
}
