package com.model.dto;

public class UserDto {
    int id;
    String username;
    String userpw;
    String phone;
    String addr;
    String email;
    int userClass;
    String gender;
    int age;
    int bizNo;
    String bizEmail;

    public UserDto() {
    }

    public UserDto(int id, String username, String userpw, String phone, String addr, String email, int userClass, String gender, int age, int bizNo, String bizEmail) {
        this.id = id;
        this.username = username;
        this.userpw = userpw;
        this.phone = phone;
        this.addr = addr;
        this.email = email;
        this.userClass = userClass;
        this.gender = gender;
        this.age = age;
        this.bizNo = bizNo;
        this.bizEmail = bizEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserClass() {
        return userClass;
    }

    public void setUserClass(int userClass) {
        this.userClass = userClass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBizNo() {
        return bizNo;
    }

    public void setBizNo(int bizNo) {
        this.bizNo = bizNo;
    }

    public String getBizEmail() {
        return bizEmail;
    }

    public void setBizEmail(String bizEmail) {
        this.bizEmail = bizEmail;
    }
}
