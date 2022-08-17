package com.model.dto;

public class PetDto {
    int petid;
    int ownerid;
    String petname;
    String speices;
    int age;
    double weight;
    int imageId;

    public PetDto() {
    }

    public PetDto(int petid, int ownerid, String petname, String speices, int age, double weight, int imageId) {
        this.petid = petid;
        this.ownerid = ownerid;
        this.petname = petname;
        this.speices = speices;
        this.age = age;
        this.weight = weight;
        this.imageId = imageId;
    }

    public int getPetid() {
        return petid;
    }

    public void setPetid(int petid) {
        this.petid = petid;
    }

    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getSpeices() {
        return speices;
    }

    public void setSpeices(String speices) {
        this.speices = speices;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
