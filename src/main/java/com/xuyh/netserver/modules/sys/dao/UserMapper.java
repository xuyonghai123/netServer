package com.xuyh.netserver.modules.sys.dao;


import com.xuyh.netserver.modules.sys.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Thinkpad on 17/04/13.
 **/
@Service
public interface UserMapper {
    User getByLoginName(String loginName);

    List<User> findAllUser();

    void insert(User user);
}
