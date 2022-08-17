package com.model.dto.MarketDto.StatusDto;

public class CancelResDto {
    int CancelResId;
    String CancelRes;

    public CancelResDto(){}

    public CancelResDto(int cancelResId, String cancelRes) {
        CancelResId = cancelResId;
        CancelRes = cancelRes;
    }

    public int getCancelResId() {
        return CancelResId;
    }

    public void setCancelResId(int cancelResId) {
        CancelResId = cancelResId;
    }

    public String getCancelRes() {
        return CancelRes;
    }

    public void setCancelRes(String cancelRes) {
        CancelRes = cancelRes;
    }
}
