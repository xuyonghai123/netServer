package com.xuyh.netserver.modules.alert.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private long organizationId;
    private String username;
    private String password;
    private String salt;
    private List<Long> roleis;
    private Boolean locked = Boolean.FALSE;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<Long> getRoleis() {
        return roleis;
    }

    public void setRoleis(List<Long> roleis) {
        this.roleis = roleis;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }
}
