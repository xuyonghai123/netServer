package spring.aop;

import com.xuyh.netserver.modules.sys.service.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by Thinkpad on 17/05/02.
 **/

@Component
public class HelloWorldService implements IHelloWorldService {


    public String sayHello(String name, int age) {
        System.out.println("=================Hello World");
        return  name;
    }

    public String test(String name, int age) {
        System.out.println("-------------TEST");
        return  name;
    }
}
