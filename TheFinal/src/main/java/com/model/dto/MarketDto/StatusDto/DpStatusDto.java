package com.model.dto.MarketDto.StatusDto;

public class DpStatusDto {
    int dpStatusId;
    String dpStatus;

    public DpStatusDto(){}

    public DpStatusDto(int dpStatusId, String dpStatus) {
        this.dpStatusId = dpStatusId;
        this.dpStatus = dpStatus;
    }

    public int getDpStatusId() {
        return dpStatusId;
    }

    public void setDpStatusId(int dpStatusId) {
        this.dpStatusId = dpStatusId;
    }

    public String getDpStatus() {
        return dpStatus;
    }

    public void setDpStatus(String dpStatus) {
        this.dpStatus = dpStatus;
    }
}
