package com.model.dto.MarketDto;

public class ProductDto {
    int productId;
    int categoryId;
    String name;
    int salesPrice;
    int originPrice;
    int supplierId;
    int stock;
    String desc;
//    desc : description 상품설명
    double rate;
    int saleStatusId;
//    sales Status Id : 판매 상태 여부
    int dpStatusId;
//    display Status Id : 상품 목록에 노출되는 상태 여부
    int optionId;
//    option id : 상품 옵션 아이디
    int usageDate;
//    usage date : 상품의 사용가능한 기간 (30/60/90일)
    int imageUrlId1;
    int imageUrlId2;
    int imageUrlId3;

    public ProductDto() {
    }

    public ProductDto(int productId, int categoryId, String name, int salesPrice, int originPrice, int supplierId, int stock, String desc, double rate, int saleStatusId, int dpStatusId, int optionId, int usageDate, int imageUrlId1, int imageUrlId2, int imageUrlId3) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.name = name;
        this.salesPrice = salesPrice;
        this.originPrice = originPrice;
        this.supplierId = supplierId;
        this.stock = stock;
        this.desc = desc;
        this.rate = rate;
        this.saleStatusId = saleStatusId;
        this.dpStatusId = dpStatusId;
        this.optionId = optionId;
        this.usageDate = usageDate;
        this.imageUrlId1 = imageUrlId1;
        this.imageUrlId2 = imageUrlId2;
        this.imageUrlId3 = imageUrlId3;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(int originPrice) {
        this.originPrice = originPrice;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getSaleStatusId() {
        return saleStatusId;
    }

    public void setSaleStatusId(int saleStatusId) {
        this.saleStatusId = saleStatusId;
    }

    public int getDpStatusId() {
        return dpStatusId;
    }

    public void setDpStatusId(int dpStatusId) {
        this.dpStatusId = dpStatusId;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public int getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(int usageDate) {
        this.usageDate = usageDate;
    }

    public int getImageUrlId1() {
        return imageUrlId1;
    }

    public void setImageUrlId1(int imageUrlId1) {
        this.imageUrlId1 = imageUrlId1;
    }

    public int getImageUrlId2() {
        return imageUrlId2;
    }

    public void setImageUrlId2(int imageUrlId2) {
        this.imageUrlId2 = imageUrlId2;
    }

    public int getImageUrlId3() {
        return imageUrlId3;
    }

    public void setImageUrlId3(int imageUrlId3) {
        this.imageUrlId3 = imageUrlId3;
    }
}
