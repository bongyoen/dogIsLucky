package com.model.dto;

public class BeautyDto {
    int beautyId;
    String name;
    String phone;
    String addr1;
    String addr2;
    String zipCode;
    int statusId;

    public BeautyDto() {
    }

    public BeautyDto(int beautyId, String name, String phone, String addr1, String addr2, String zipCode, int statusId) {
        this.beautyId = beautyId;
        this.name = name;
        this.phone = phone;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.zipCode = zipCode;
        this.statusId = statusId;
    }

    public int getBeautyId() {
        return beautyId;
    }

    public void setBeautyId(int beautyId) {
        this.beautyId = beautyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
