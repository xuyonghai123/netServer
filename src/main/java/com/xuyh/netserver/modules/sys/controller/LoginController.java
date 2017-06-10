package com.xuyh.netserver.modules.sys.controller;

import com.xuyh.netserver.modules.sys.dao.UserMapper;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final UserMapper userMapper;

    @Autowired
    public LoginController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    /***
     * 返回登录页面
     * */
    @RequestMapping(value = "/login")
    public String showLoginForm(HttpServletRequest req, Model model){
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        logger.info("exception",exceptionClassName);
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
            logger.error(error,exceptionClassName);
        }else if (LockedAccountException.class.getName().equals(exceptionClassName)){
            error = "账号被冻结";
            logger.error(error,exceptionClassName);
        }
        else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
            logger.error(error,exceptionClassName);
        } else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
            logger.error(error,exceptionClassName);
        }
        logger.error("error:",error);
        model.addAttribute("error", error);
        return "login";
    }
}
