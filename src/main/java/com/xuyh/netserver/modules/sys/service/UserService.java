package com.xuyh.netserver.modules.sys.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Thinkpad on 17/05/25.
 **/


@Component
@Service
public class UserService implements IUserService{

    public void sayHello(){
        System.out.println("测试AOP");
    }

}
