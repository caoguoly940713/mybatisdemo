package com.example.mybatisdemo.entity;

//用户实体
public class User {
    private String userName;
    private String userLoginName;
    private String passWord;
    private String gender;

    public User() {
    }

    public User(String userName, String userLoginName, String passWord, String gender) {
        this.userName = userName;
        this.userLoginName = userLoginName;
        this.passWord = passWord;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
