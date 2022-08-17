package com.model.dto.MarketDto;

import java.util.Date;

public class ChangesDto {
    int changeId;
    int userId;
    int orderId;
    int productId;
    int quantity;
    String reason;
    Date applyDate;
//    apply date : 제품 교환을 신청한 일
    String sellerComment;
    int progressId;
//    progress id : 진행 상황
    int resultId;
    Date compDate;
//    completed date : 제품 교환을 완료된 일


    public ChangesDto() {
    }

    public ChangesDto(int changeId, int userId, int orderId, int productId, int quantity, String reason, Date applyDate, String sellerComment, int progressId, int resultId, Date compDate) {
        this.changeId = changeId;
        this.userId = userId;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.reason = reason;
        this.applyDate = applyDate;
        this.sellerComment = sellerComment;
        this.progressId = progressId;
        this.resultId = resultId;
        this.compDate = compDate;
    }

    public int getChangeId() {
        return changeId;
    }

    public void setChangeId(int changeId) {
        this.changeId = changeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
