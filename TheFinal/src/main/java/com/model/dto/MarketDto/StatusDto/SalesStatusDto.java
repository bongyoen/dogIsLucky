package com.model.dto.MarketDto.StatusDto;

public class SalesStatusDto {
    int saStatusId;
    String saStatus;

    public SalesStatusDto(){}

    public SalesStatusDto(int saStatusId, String saStatus) {
        this.saStatusId = saStatusId;
        this.saStatus = saStatus;
    }

    public int getSaStatusId() {
        return saStatusId;
    }

    public void setSaStatusId(int saStatusId) {
        this.saStatusId = saStatusId;
    }

    public String getSaStatus() {
        return saStatus;
    }

    public void setSaStatus(String saStatus) {
        this.saStatus = saStatus;
    }
}
