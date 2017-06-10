package com.xuyh.netserver.modules.sys.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Thinkpad on 17/05/25.
 **/


@Component
@Service
@Transactional(readOnly = true)
public class UserService implements IUserService{

    @Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
    public void sayHello(){
        System.out.println();
        System.out.println("测试AOP");
    }

}
