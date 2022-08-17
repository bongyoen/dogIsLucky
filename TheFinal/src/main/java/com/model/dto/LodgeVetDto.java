package com.model.dto;

public class LodgeVetDto {
    int lodgeId;
    int userId;
    int petId;
    int vetId;

    public LodgeVetDto() {
    }

    public LodgeVetDto(int lodgeId, int userId, int petId, int vetId) {
        this.lodgeId = lodgeId;
        this.userId = userId;
        this.petId = petId;
        this.vetId = vetId;
    }

    public int getLodgeId() {
        return lodgeId;
    }

    public void setLodgeId(int lodgeId) {
        this.lodgeId = lodgeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }
}
