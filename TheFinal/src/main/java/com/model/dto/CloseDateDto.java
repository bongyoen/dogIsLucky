package com.model.dto;

import java.util.Date;

public class CloseDateDto {
    int closeDateId;
    Date closeDate;
    int vetid;

    public CloseDateDto() {
    }

    public CloseDateDto(int closeDateId, Date closeDate, int vetid) {
        this.closeDateId = closeDateId;
        this.closeDate = closeDate;
        this.vetid = vetid;
    }

    public int getCloseDateId() {
        return closeDateId;
    }

    public void setCloseDateId(int closeDateId) {
        this.closeDateId = closeDateId;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public int getVetid() {
        return vetid;
    }

    public void setVetid(int vetid) {
        this.vetid = vetid;
    }
}
