package com.model.dto;

import java.util.Date;

public class BookTimeClassDto {
    int timeClassId;
    Date availableTime;

    public BookTimeClassDto() {
    }

    public BookTimeClassDto(int timeClassId, Date availableTime) {
        this.timeClassId = timeClassId;
        this.availableTime = availableTime;
    }

    public int getTimeClassId() {
        return timeClassId;
    }

    public void setTimeClassId(int timeClassId) {
        this.timeClassId = timeClassId;
    }

    public Date getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(Date availableTime) {
        this.availableTime = availableTime;
    }
}
