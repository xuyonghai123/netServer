package com.xuyh.netserver.modules.sys.test;

import com.xuyh.netserver.modules.sys.dao.UserDao;
import com.xuyh.netserver.modules.sys.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Thinkpad on 17/09/03.
 **/
public class Test1 {
    @Autowired
    UserDao userDao;

    @Test
    public  void json(){
        List<User> list = userDao.findAll();
        System.out.println(list);
        System.out.println("Test");
    }
}
