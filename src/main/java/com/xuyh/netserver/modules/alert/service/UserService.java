package com.xuyh.netserver.modules.alert.service;

import com.xuyh.netserver.modules.alert.beans.UserBean;
import com.xuyh.netserver.modules.alert.dao.UserMapper;
import com.xuyh.netserver.common.utils.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Thinkpad on 17/04/13.
 **/

@Service
public class UserService {
    public static void main(String[] args) {
//        insertUser();
//        findUserById();
        findAllUser();
//        deleteUser();
    }

    /*
    * 新增用户
    * */
    public  void insertUser() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserBean user = new UserBean("一", "123123", 1000.0);
        try {
            mapper.insertUser(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /*
    *删除用户
    */
    private static void deleteUser() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(1);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /*
    * 根据id查找用户
    * */
    private static void findUserById() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        UserBean user = new UserBean("一","123123",1000.0);
        try {
            UserBean userBean = mapper.findUserById(2);
            System.out.println(userBean.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    /*
    * 查找所有用户
    **/
    private static void findAllUser() {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        try {
            List userList = mapper.findAllUser();
            System.out.println(userList.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

}
