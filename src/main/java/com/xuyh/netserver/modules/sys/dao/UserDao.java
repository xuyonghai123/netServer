package com.xuyh.netserver.modules.sys.dao;

import com.xuyh.netserver.modules.sys.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Thinkpad on 17/05/07.
 **/
@Service
public interface UserDao {

    User getByLoginName(User user);

}
