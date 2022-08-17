package com.model.dto.MarketDto.StatusDto;

public class BuyConfirmDto {
    int BuyConfirmId;
    String confirmation;

    public BuyConfirmDto(){}

    public BuyConfirmDto(int buyConfirmId, String confirmation) {
        BuyConfirmId = buyConfirmId;
        this.confirmation = confirmation;
    }

    public int getBuyConfirmId() {
        return BuyConfirmId;
    }

    public void setBuyConfirmId(int buyConfirmId) {
        BuyConfirmId = buyConfirmId;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }
}
