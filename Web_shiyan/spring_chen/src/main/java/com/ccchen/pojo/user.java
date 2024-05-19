package com.ccchen.pojo;

public class user {
    private Integer userId;
    private String username;
    private String password;
    private String tel;

    public user() {
    }
    public user(Integer userId, String username, String password, String tel) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.tel = tel;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
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
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String toString() {
        return "user{userId = " + userId + ", username = " + username + ", password = " + password + ", tel = " + tel + "}";
    }
}
