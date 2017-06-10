package com.xuyh.netserver.test.dao;

import com.xuyh.netserver.modules.sys.dao.*;

/**
 * Created by Thinkpad on 17/05/24.
 **/
public class DaoTest {
    public static void main(String[] args) {
        RoleDao roleDao = new RoleDaoImpl();
        System.out.println(roleDao);

//        UserDao userDao = new UserDaoImpl();
//        System.out.println(userDao);
    }
}
