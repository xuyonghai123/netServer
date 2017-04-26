package com.xuyh.netserver.modules.alert.controller;

import com.xuyh.netserver.modules.alert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * Created by Thinkpad on 17/04/12.
 **/
@Controller
public class HelloWorld {
    private Logger logger = Logger.getLogger(HelloWorld.class.getName());

    @Autowired
    private  UserService userService;

    @RequestMapping("/helloworld")
    public String home(){

        logger.info("记录日志信息，将在控制台输出");
        userService.insertUser();
        return  "success";
    }

    @RequestMapping("/netserver")
    public String index (){
        return  "index";
    }
}
