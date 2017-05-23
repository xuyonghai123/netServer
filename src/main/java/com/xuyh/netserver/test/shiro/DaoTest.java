package com.xuyh.netserver.test.shiro;

import com.xuyh.netserver.modules.alert.dao.*;

/**
 * Created by Thinkpad on 17/05/24.
 **/
public class DaoTest {
    public static void main(String[] args) {
        OrganizationDao organization = new OrganizationDaoImpl();
        String s = organization.toString();
        System.out.println(s);

        ResourceDao resourceDao = new ResourceDaoImpl();
        System.out.println(resourceDao);

        RoleDao roleDao = new RoleDaoImpl();
        System.out.println(roleDao);

        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao);
    }
}
