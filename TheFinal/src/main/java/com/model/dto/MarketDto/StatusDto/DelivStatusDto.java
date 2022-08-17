package com.model.dto.MarketDto.StatusDto;

public class DelivStatusDto {
//    물품 배송상태 DTO
    int deliStatusid;
    String deliStatus;

    public DelivStatusDto(){}

    public DelivStatusDto(int deliStatusid, String deliStatus) {
        this.deliStatusid = deliStatusid;
        this.deliStatus = deliStatus;
    }

    public int getDeliStatusid() {
        return deliStatusid;
    }

    public void setDeliStatusid(int deliStatusid) {
        this.deliStatusid = deliStatusid;
    }

    public String getDeliStatus() {
        return deliStatus;
    }

    public void setDeliStatus(String deliStatus) {
        this.deliStatus = deliStatus;
    }
}
