package com.model.dto.MarketDto;

public class CategoryDto {
    int cateId;
//    cateId : category Id;
    String category;

    public CategoryDto(){}

    public CategoryDto(int cateId, String category) {
        this.cateId = cateId;
        this.category = category;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
