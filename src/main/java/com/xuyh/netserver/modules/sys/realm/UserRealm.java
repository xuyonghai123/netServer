package com.xuyh.netserver.modules.sys.realm;

import com.xuyh.netserver.common.utils.Encodes;
import com.xuyh.netserver.modules.sys.dao.UserDao;
import com.xuyh.netserver.modules.sys.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Thinkpad on 17/05/07.
 **/

public class UserRealm extends AuthorizingRealm{

    @Autowired
    UserDao userDao;

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
        User user1 = new User();
        user1.setLoginName(username);
        User user=userDao.getByLoginName(user1);
        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }
        if(Boolean.TRUE.equals(false)) {
            throw new LockedAccountException(); //帐号锁定
        }
        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        byte[] salt = Encodes.decodeHex(user.getPassword().substring(0,16));
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
            user.getLoginName(), //用户名
            user.getPassword().substring(16), //密码
            ByteSource.Util.bytes(salt),
            getName()  //realm name
        );
        return authenticationInfo;
    }

    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher("SHA-1");
        matcher.setHashIterations(1024);
        setCredentialsMatcher(matcher);
    }
}
