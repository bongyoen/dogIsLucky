package com.model.dto.MarketDto;

import java.util.Date;

public class SubscribedItemDto {
    int SubscribeId;
    int userId;
    int productId;
    Date orderDate;

    public SubscribedItemDto(){}

    public SubscribedItemDto(int subscribeId, int userId, int productId, Date orderDate) {
        SubscribeId = subscribeId;
        this.userId = userId;
        this.productId = productId;
        this.orderDate = orderDate;
    }

    public int getSubscribeId() {
        return SubscribeId;
    }

    public void setSubscribeId(int subscribeId) {
        SubscribeId = subscribeId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
