package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * Created by Thinkpad on 17/05/02.
 **/
@Aspect
public class HelloWorldAspect {

    @Before("execution(* spring.aop.*.*(..))")
    public void beforeHandler(JoinPoint jp) {
        System.out.println("前置通知:" +jp.getSignature());
        System.out.println("Before增强：目标方法的参数为："+ Arrays.toString(jp.getArgs()));
    }

//    public void aroundHandler(ProceedingJoinPoint jointPoint) {
//        try {
//            System.out.println("环绕通知开始");
//            String name = (String) jointPoint.proceed();
//            jointPoint.proceed();
//            System.out.println(name + "环绕通知结束");
//        } catch (Throwable e) {
//
//        }
//    }
//
//    public void afterHandler() {
//        System.out.println("后置通知");
//    }
//
//    public void returnHandler(Object name) { //在返回通知中获取返回值
//        System.out.println("返回通知:" + name);
//    }
//
//    public void throwExceptionHandler(Throwable ex) {
//        System.out.println("异常通知:" + ex.getMessage());
//    }
}
