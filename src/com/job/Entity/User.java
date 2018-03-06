package com.job.Entity;

/**
 * 用户名 密码 手机号码 邮箱
 */
public class User {
    private String name;
    private String password;
    private String telphone;
    private String email;

    public User() {
    }

    public User(String name, String password, String telphone, String email) {
        this.name = name;
        this.password = password;
        this.telphone = telphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", telphone='" + telphone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
