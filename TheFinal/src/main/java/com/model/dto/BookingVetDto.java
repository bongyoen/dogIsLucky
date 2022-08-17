package com.model.dto;

import java.util.Date;

public class BookingVetDto {
    int bookId;
    int userId;
    int petId;
    Date bookDate;
    Date bookTime;
    int vetId;
    String comments;

    public BookingVetDto() {
    }

    public BookingVetDto(int bookId, int userId, int petId, Date bookDate, Date bookTime, int vetId, String comments) {
        this.bookId = bookId;
        this.userId = userId;
        this.petId = petId;
        this.bookDate = bookDate;
        this.bookTime = bookTime;
        this.vetId = vetId;
        this.comments = comments;
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

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public int getVetId() {
        return vetId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
