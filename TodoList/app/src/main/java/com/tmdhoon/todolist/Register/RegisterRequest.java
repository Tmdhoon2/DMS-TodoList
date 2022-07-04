package com.tmdhoon.todolist.Register;

public class RegisterRequest {
    private String userId;
    private int userAge;
    private String userName;
    private String userPw;

    public RegisterRequest(String userId, int userAge, String userName, String userPw) {
        this.userId = userId;
        this.userAge = userAge;
        this.userName = userName;
        this.userPw = userPw;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPw() {
        return userPw;
    }
}
