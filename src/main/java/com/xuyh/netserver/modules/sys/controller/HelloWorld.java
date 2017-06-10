package com.xuyh.netserver.modules.sys.controller;

import com.xuyh.netserver.modules.sys.dao.UserDao;
import com.xuyh.netserver.modules.sys.dao.UserMapper;
import com.xuyh.netserver.modules.sys.entity.User;
import com.xuyh.netserver.modules.sys.service.UserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * Created by Thinkpad on 17/04/12.
 **/
@Controller
public class HelloWorld {

    @Autowired
    private UserService userService;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserDao userDao;

    private Logger logger = LoggerFactory.getLogger(getClass());


    /***
     * 返回主页面
     * */
    @RequiresRoles(value = {"admin"})
    @RequestMapping("/index")
    public String home(Model model){
        logger.info("记录日志信息，将在控制台输出");
        userService.sayHello();
        User user = new User();
        user.setLoginName("thinkgem");
        User user2 = userDao.getByLoginName(user);
        model.addAttribute("user",user2);
        return "index";
    }


    /***
     * 返回登录页面
     * */
    @RequestMapping("/netserver")
    public String index (){
        System.out.println();
        return  "login";
    }


    /***
     * 返回主页面
     * */
    @RequestMapping("/success")
    public String success (HttpServletRequest req, Model model){
        model.addAttribute("suuccess", "success");
        return  "success";
    }


    /***
     * 返回json
     * */
    @RequestMapping("/json")
    @ResponseBody
    public List<User> json (){
        logger.info("user:"+userMapper.findAllUser());
        return userMapper.findAllUser();
    }

    @RequestMapping("/success1")
    public String findbyname(String name,Model model){
        User user2 = userDao.getByLoginName(new User(name,null,null));
        model.addAttribute(user2);
        return "success";
    }

    @RequestMapping("/success2/{name}")
    public String findbyname1(@PathVariable("name") String name, Map<String,Object> model){
        User user = userDao.getByLoginName(new User(name,null,null));
        model.put("user",user);
        return "success";
    }

    @RequestMapping("/success3")
    public String findbyname3(HttpServletRequest request){
        String name = request.getParameter("name");
        User user = userDao.getByLoginName(new User(name,null,null));
        request.setAttribute("user",user);
        return "success";
    }
}
