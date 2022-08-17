package com.model.dto;

public class UserClassDto {
    int userclassid;
    String userclass;

    public UserClassDto() {
    }

    public UserClassDto(int userclassid, String userclass) {
        this.userclassid = userclassid;
        this.userclass = userclass;
    }

    public int getUserclassid() {
        return userclassid;
    }

    public void setUserclassid(int userclassid) {
        this.userclassid = userclassid;
    }

    public String getUserclass() {
        return userclass;
    }

    public void setUserclass(String userclass) {
        this.userclass = userclass;
    }
}
