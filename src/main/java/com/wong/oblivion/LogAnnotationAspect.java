package com.wong.oblivion;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by wong on 18/7/4.
 */
@Aspect
public class LogAnnotationAspect {
    @Pointcut("execution(* com.wong.oblivion.*.*(..))")
    private void allMethod() {}

    @Before(("execution(* com.wong.oblivion.*.*(..))"))
    public void before(JoinPoint call){
        Object[] args = call.getArgs();
        System.out.println("use aspect, log before........");
    }
}
