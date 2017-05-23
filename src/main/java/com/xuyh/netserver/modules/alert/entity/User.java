package com.xuyh.netserver.modules.alert.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
    private Double account;

    public User() {
        super();
    }

    public User(String username, String password, Double account) {
        super();
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public User(Integer id, String username, String password, Double account) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + ", account=" + account + "]";
    }
}
