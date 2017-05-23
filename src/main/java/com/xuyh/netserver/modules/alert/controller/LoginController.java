package com.xuyh.netserver.modules.alert.controller;

import com.xuyh.netserver.modules.alert.dao.UserMapper;
import com.xuyh.netserver.modules.alert.entity.User;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Thinkpad on 17/05/07.
 **/
@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/login")
    public String showLoginForm(HttpServletRequest req, Model model){
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
        System.out.println("exception:"+exceptionClassName);

        User user=userMapper.getByLoginName(1);
//        System.out.println("user:"+user);
        return "login";
    }
}
