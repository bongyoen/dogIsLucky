package com.model.dto.MarketDto;

import java.util.Date;

public class RefundDto {
    int refundId;
    int orderId;
    int productId;
    int amount;
    String reason;
    Date applyDate;
//    apply date : 환불을 신청한 날
    String sellerComment;
    int progressId;
//    progress id : 진행상태
    int resultId;
    Date compDate;
//    completed date : 환불을 완료한 날


    public RefundDto() {
    }

    public RefundDto(int refundId, int orderId, int productId, int amount, String reason, Date applyDate, String sellerComment, int progressId, int resultId, Date compDate) {
        this.refundId = refundId;
        this.orderId = orderId;
        this.productId = productId;
        this.amount = amount;
        this.reason = reason;
        this.applyDate = applyDate;
        this.sellerComment = sellerComment;
        this.progressId = progressId;
        this.resultId = resultId;
        this.compDate = compDate;
    }

    public int getRefundId() {
        return refundId;
    }

    public void setRefundId(int refundId) {
        this.refundId = refundId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getSellerComment() {
        return sellerComment;
    }

    public void setSellerComment(String sellerComment) {
        this.sellerComment = sellerComment;
    }

    public int getProgressId() {
        return progressId;
    }

    public void setProgressId(int progressId) {
        this.progressId = progressId;
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public Date getCompDate() {
        return compDate;
    }

    public void setCompDate(Date compDate) {
        this.compDate = compDate;
    }
}
