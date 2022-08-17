package com.model.dto.MarketDto.StatusDto;

public class RefundResDto {
    int refundResId;
    String refundRes;

    public RefundResDto(){};

    public RefundResDto(int refundResId, String refundRes) {
        this.refundResId = refundResId;
        this.refundRes = refundRes;
    }

    public int getRefundResId() {
        return refundResId;
    }

    public void setRefundResId(int refundResId) {
        this.refundResId = refundResId;
    }

    public String getRefundRes() {
        return refundRes;
    }

    public void setRefundRes(String refundRes) {
        this.refundRes = refundRes;
    }
}
