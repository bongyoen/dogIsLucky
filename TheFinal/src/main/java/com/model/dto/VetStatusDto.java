package com.model.dto;

public class VetStatusDto {
    int vetStatusId;
    String status;

    public VetStatusDto() {
    }

    public VetStatusDto(int vetStatusId, String status) {
        this.vetStatusId = vetStatusId;
        this.status = status;
    }

    public int getVetStatusId() {
        return vetStatusId;
    }

    public void setVetStatusId(int vetStatusId) {
        this.vetStatusId = vetStatusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
