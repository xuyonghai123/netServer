package com.xuyh.netserver.modules.sys.realm;

import com.xuyh.netserver.modules.sys.dao.UserMapper;
import com.xuyh.netserver.modules.sys.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Thinkpad on 17/05/07.
 **/

public class UserRealm extends AuthorizingRealm{

    @Autowired
    UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();
        System.out.println("Authorization.username:"+username);
        Set<String> set = new HashSet<String>();
        set.add("admin");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(set);
        authorizationInfo.setStringPermissions(set);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)  {
        String username = (String)token.getPrincipal();
        User user=userMapper.getByLoginName(username);

        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }else {
            System.out.println("user:"+user);
            System.out.println("user:"+user.getName());
            System.out.println("user:"+user.getEmail());
        }
        if(Boolean.TRUE.equals(false)) {
            throw new LockedAccountException(); //帐号锁定
        }
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
            user.getUsername(), //用户名
            user.getPassword().toCharArray(), //密码
            getName()  //realm name
        );
        return authenticationInfo;
    }
}
