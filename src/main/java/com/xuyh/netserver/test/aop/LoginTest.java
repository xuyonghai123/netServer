package com.xuyh.netserver.test.aop;

import com.xuyh.netserver.modules.sys.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thinkpad on 17/05/27.
 **/
public class LoginTest {
    @Test
    public void testhelloworld(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        IUserService helloWorldService = applicationContext.getBean("userService", IUserService.class);
        helloWorldService.sayHello();
    }
}
