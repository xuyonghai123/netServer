package com.xuyh.netserver.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Thinkpad on 17/05/27.
 **/

@Component
@Aspect
public class LoginAspect {

    @Before("execution(* com.xuyh.netserver.modules.sys.service.*.*(..))")
    public void beforeHandler(JoinPoint jp) {
        System.out.println("前置通知:" +jp.getSignature());
        System.out.println("Before增强：目标方法的参数为："+ Arrays.toString(jp.getArgs()));
    }
}
