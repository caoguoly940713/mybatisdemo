package com.example.mybatisdemo.entity;

//用户实体
public class User {
    private int id;
    private String userName;
    private String userLoginName;
    private String passWord;
    private String gender;

    public User() {
    }

    public User(User another) {
        this.setUserName(another.getUserName());
        this.setPassWord(another.getPassWord());
        this.setGender(another.getGender());
        this.setUserLoginName(another.getUserLoginName());
        this.setId(another.getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userLoginName='" + userLoginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
