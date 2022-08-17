package com.model.dto.MarketDto;

public class OrderTypeDto {
    int orderTypeId;
    String type;

    public OrderTypeDto(){}

    public OrderTypeDto(int orderTypeId, String type) {
        this.orderTypeId = orderTypeId;
        this.type = type;
    }

    public int getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(int orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
