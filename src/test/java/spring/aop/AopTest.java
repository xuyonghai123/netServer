package spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thinkpad on 17/05/02.
 **/
public class AopTest {
    @Test
    public void testhelloworld(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test.xml");
        IHelloWorldService helloWorldService = applicationContext.getBean("helloWorldService", IHelloWorldService.class);
        helloWorldService.test("xuyh",27);
    }
}
