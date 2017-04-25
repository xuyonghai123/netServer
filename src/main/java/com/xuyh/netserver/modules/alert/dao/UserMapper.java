package com.xuyh.netserver.modules.alert.dao;

import com.xuyh.netserver.modules.alert.beans.UserBean;

import java.util.List;

/**
 * Created by Thinkpad on 17/04/13.
 **/
public interface UserMapper {
    public  int insertUser(UserBean userBean) throws Exception;

    public  int updateUser(UserBean userBean,int id) throws Exception;

    public  int deleteUser(int id) throws Exception;

    public  UserBean findUserById(int id) throws Exception;

    public List findAllUser() throws Exception;

}
