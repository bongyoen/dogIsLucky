package com.model.dto.MarketDto;

public class BasketDto {
    int basketId;
    int productId;
    int userId;
    int quantity;

    public BasketDto() {
    }

    public BasketDto(int basketId, int productId, int userId, int quantity) {
        this.basketId = basketId;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basketId) {
        this.basketId = basketId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
