package com.xuyh.netserver.test.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * Created by Thinkpad on 17/04/28.
 **/
public class MyRealm2 implements Realm {
    public String getName() {
        return "myrealm2";
    }

    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = (String) token.getCredentials();
        if(!"wang".equals(username)){
            throw  new UnknownAccountException();
        }
        if(!"123".equals(password)){
            throw  new IncorrectCredentialsException();
        }
        return null;
    }
}
