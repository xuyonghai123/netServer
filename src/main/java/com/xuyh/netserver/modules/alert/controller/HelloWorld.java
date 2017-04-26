package com.xuyh.netserver.modules.alert.controller;

import com.xuyh.netserver.modules.alert.beans.UserBean;
import com.xuyh.netserver.modules.alert.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    @ResponseBody
    @RequestMapping( "/json")
    public String json (){
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setUsername("xuyh");
        userBean.setPassword("123456");
        userBean.setAccount((double) 123);

        return userBean.toString();
    }

    @ResponseBody
    @RequestMapping("/json1")
    public UserBean json1 (){
        UserBean userBean = new UserBean();
        userBean.setId(1);
        userBean.setUsername("xuyh");
        userBean.setPassword("123456");
        userBean.setAccount((double) 123);
        System.out.println("userbean:"+userBean);
        return  userBean;
    }

}
