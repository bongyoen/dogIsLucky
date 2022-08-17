package com.model.dto.MarketDto;

import java.util.Date;

public class OrdersDto {
    int orderId;
    int userId;
    int productId;
    int quantity;
//    quantity : 주문 수량
    int totalPrice;
    Date orderDate;
    int supplierId;
    int deliveryStatusId;
    int buyConfirmedId;
    int orderTypeId;
    Date confirmDate;
    String sellerComment;

    public OrdersDto() {
    }

    public OrdersDto(int orderId, int userId, int productId, int quantity, int totalPrice, Date orderDate, int supplierId, int deliveryStatusId, int buyConfirmedId, int orderTypeId, Date confirmDate, String sellerComment) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
        this.supplierId = supplierId;
        this.deliveryStatusId = deliveryStatusId;
        this.buyConfirmedId = buyConfirmedId;
        this.orderTypeId = orderTypeId;
        this.confirmDate = confirmDate;
        this.sellerComment = sellerComment;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getDeliveryStatusId() {
        return deliveryStatusId;
    }

    public void setDeliveryStatusId(int deliveryStatusId) {
        this.deliveryStatusId = deliveryStatusId;
    }

    public int getBuyConfirmedId() {
        return buyConfirmedId;
    }

    public void setBuyConfirmedId(int buyConfirmedId) {
        this.buyConfirmedId = buyConfirmedId;
    }

    public int getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(int orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getSellerComment() {
        return sellerComment;
    }

    public void setSellerComment(String sellerComment) {
        this.sellerComment = sellerComment;
    }
}
