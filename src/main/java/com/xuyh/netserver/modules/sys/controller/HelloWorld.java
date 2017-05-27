package com.xuyh.netserver.modules.sys.controller;

import com.xuyh.netserver.modules.sys.dao.UserMapper;
import com.xuyh.netserver.modules.sys.entity.User;
import com.xuyh.netserver.modules.sys.service.UserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Thinkpad on 17/04/12.
 **/
@Controller
public class HelloWorld {
    @Autowired
    private UserService userService;

    @Autowired
    UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequiresRoles(value = {"admin"})
    @RequestMapping("/index")
    public String home(){
        logger.info("记录日志信息，将在控制台输出");

        userService.sayHello();

        User user = new User();
        user.setUsername("test");
        user.setPassword("xuyh");
        user.setAccount(100.1);
        userMapper.insert(user);
        return  "index";
    }

    @RequestMapping("/netserver")
    public String index (){
        return  "login";
    }

}
