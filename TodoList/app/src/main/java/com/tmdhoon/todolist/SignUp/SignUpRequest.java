package com.tmdhoon.todolist.SignUp;

public class SignUpRequest {
    private String userName;
    private int userAge;
    private String userId;
    private String userPw;

    public SignUpRequest(String userName, int userAge, String userId, String userPw) {
        this.userName = userName;
        this.userAge = userAge;
        this.userId = userId;
        this.userPw = userPw;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPw() {
        return userPw;
    }
}
