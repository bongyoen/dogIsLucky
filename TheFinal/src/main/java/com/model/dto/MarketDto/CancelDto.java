package com.model.dto.MarketDto;

import java.util.Date;

public class CancelDto {
    int cancelId;
    int orderId;
    int productId;
    int userId;
    Date applyDate;
    String reason;
    int progressId;
    int quantity;
    int price;
    Date cancDate;
//    Cancel Date : 취소 신청 날짜
    int resultid;
//    result id : 취고 결과
    Date compDate;
//    completed date : 취소 완료 날짜


    public CancelDto() {
    }

    public CancelDto(int cancelId, int orderId, int productId, int userId, Date applyDate, String reason, int progressId, int quantity, int price, Date cancDate, int resultid, Date compDate) {
        this.cancelId = cancelId;
        this.orderId = orderId;
        this.productId = productId;
        this.userId = userId;
        this.applyDate = applyDate;
        this.reason = reason;
        this.progressId = progressId;
        this.quantity = quantity;
        this.price = price;
        this.cancDate = cancDate;
        this.resultid = resultid;
        this.compDate = compDate;
    }

    public int getCancelId() {
        return cancelId;
    }

    public void setCancelId(int cancelId) {
        this.cancelId = cancelId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getProgressId() {
        return progressId;
    }

    public void setProgressId(int progressId) {
        this.progressId = progressId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCancDate() {
        return cancDate;
    }

    public void setCancDate(Date cancDate) {
        this.cancDate = cancDate;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public Date getCompDate() {
        return compDate;
    }

    public void setCompDate(Date compDate) {
        this.compDate = compDate;
    }
}
