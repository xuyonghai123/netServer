package com.xuyh.netserver.modules.alert.dao;


import com.xuyh.netserver.modules.alert.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Thinkpad on 17/04/13.
 **/
@Service
public interface UserMapper {

    public User getByLoginName(int id);

}
