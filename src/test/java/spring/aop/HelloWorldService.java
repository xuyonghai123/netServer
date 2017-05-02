package spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Thinkpad on 17/05/02.
 **/
@Component
public class HelloWorldService implements IHelloWorldService {

    @Override
    public String sayHello(String name, int age) {
        System.out.println("=================Hello World");
        return  name;
    }

    @Override
    public String test(String name, int age) {
        System.out.println("-------------TEST");
        return  name;
    }
}
