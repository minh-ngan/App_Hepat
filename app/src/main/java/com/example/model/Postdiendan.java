package com.example.model;

public class Postdiendan {
    private String userName;
    private String userTime;
    private String userQuestion;

    public Postdiendan(String userName, String userTime, String userQuestion) {
        this.userName = userName;
        this.userTime = userTime;
        this.userQuestion = userQuestion;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }
}
