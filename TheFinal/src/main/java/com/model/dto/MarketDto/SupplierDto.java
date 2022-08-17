package com.model.dto.MarketDto;

public class SupplierDto {
    int supplierId;
    int userId;

    public SupplierDto() {
    }

    public SupplierDto(int supplierId, int userId) {
        this.supplierId = supplierId;
        this.userId = userId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
