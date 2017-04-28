package com.xuyh.netserver.test.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by Thinkpad on 17/04/27.
 **/
public class MyRealm implements Realm {
    public String getName() {
        return "myrealm";
    }

    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        if(!"wang".equals(username)){
            throw  new UnknownAccountException();
        }
        if(!"123".equals(password)){
            throw  new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
