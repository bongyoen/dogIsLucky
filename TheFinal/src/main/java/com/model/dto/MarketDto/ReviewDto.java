package com.model.dto.MarketDto;

import java.util.Date;

public class ReviewDto {
    int reviewId;
    int productId;
    int userId;
    String comments;
    int rate;
    int imageId;
    Date regDate;

    public ReviewDto(){}

    public ReviewDto(int reviewId, int productId, int userId, String comments, int rate, int imageId, Date regDate) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.userId = userId;
        this.comments = comments;
        this.rate = rate;
        this.imageId = imageId;
        this.regDate = regDate;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
