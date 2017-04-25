package com.xuyh.netserver.modules.alert.beans;

import java.io.Serializable;

/**
 * Created by Thinkpad on 17/04/13.
 **/
public class UserBean implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private Double account;

    public UserBean() {
        super();
    }

    public UserBean(String username, String password, Double account) {
        super();
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public UserBean(Integer id, String username, String password, Double account) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
        return "UserBean [id=" + id + ", username=" + username + ", password="
                + password + ", account=" + account + "]";
    }

}
