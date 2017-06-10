package com.xuyh.netserver.modules.sys.entity;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Thinkpad on 17/05/07.
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Office company;	// 归属公司
    private Office office;	// 归属部门
    private Integer id;
    private String loginName;
    private String password;
    private Double account;
    private String no;		// 工号
    private String name;	// 姓名
    private String email;	// 邮箱
    private String phone;	// 电话
    private String mobile;	// 手机
    private String userType;// 用户类型
    private String loginIp;	// 最后登陆IP
    private Date loginDate;	// 最后登陆日期
    private String loginFlag;	// 是否允许登陆
    private String photo;	// 头像
    private String oldLoginName;// 原登录名
    private String newPassword;	// 新密码
    private String oldLoginIp;	// 上次登陆IP
    private Date oldLoginDate;	// 上次登陆日期

    private List<Role> roleList = Lists.newArrayList(); // 拥有角色列表

    public User() {
        super();
    }

    public User(String loginName, String password, Double account) {
        super();
        this.loginName = loginName;
        this.password = password;
        this.account = account;
    }

    public User(Integer id, String loginName, String password, Double account) {
        super();
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.account = account;
    }

    public Office getCompany() {
        return company;
    }

    public void setCompany(Office company) {
        this.company = company;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getOldLoginName() {
        return oldLoginName;
    }

    public void setOldLoginName(String oldLoginName) {
        this.oldLoginName = oldLoginName;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldLoginIp() {
        return oldLoginIp;
    }

    public void setOldLoginIp(String oldLoginIp) {
        this.oldLoginIp = oldLoginIp;
    }

    public Date getOldLoginDate() {
        return oldLoginDate;
    }

    public void setOldLoginDate(Date oldLoginDate) {
        this.oldLoginDate = oldLoginDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    @Override
    public String toString() {
        return "User{" +
                "company=" + company +
                ", office=" + office +
                ", id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userType='" + userType + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginDate=" + loginDate +
                ", loginFlag='" + loginFlag + '\'' +
                ", photo='" + photo + '\'' +
                ", oldLoginName='" + oldLoginName + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", oldLoginIp='" + oldLoginIp + '\'' +
                ", oldLoginDate=" + oldLoginDate +
                ", roleList=" + roleList +
                '}';
    }

    public void setAccount(Double account) {
        this.account = account;
    }

}
