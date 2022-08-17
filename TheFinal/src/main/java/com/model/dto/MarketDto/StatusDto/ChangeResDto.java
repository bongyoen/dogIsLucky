package com.model.dto.MarketDto.StatusDto;

public class ChangeResDto {
    int changeResId;
    String changeRes;

    public ChangeResDto(){};

    public ChangeResDto(int changeResId, String changeRes) {
        this.changeResId = changeResId;
        this.changeRes = changeRes;
    }

    public int getChangeResId() {
        return changeResId;
    }

    public void setChangeResId(int changeResId) {
        this.changeResId = changeResId;
    }

    public String getChangeRes() {
        return changeRes;
    }

    public void setChangeRes(String changeRes) {
        this.changeRes = changeRes;
    }
}
