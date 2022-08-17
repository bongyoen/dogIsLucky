package com.model.dto;

public class BookBeautyDto {
    int bookId;
    int userId;
    int petId;
    int beautyId;

    public BookBeautyDto() {
    }

    public BookBeautyDto(int bookId, int userId, int petId, int beautyId) {
        this.bookId = bookId;
        this.userId = userId;
        this.petId = petId;
        this.beautyId = beautyId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getBeautyId() {
        return beautyId;
    }

    public void setBeautyId(int beautyId) {
        this.beautyId = beautyId;
    }
}
