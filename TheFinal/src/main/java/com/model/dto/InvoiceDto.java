package com.model.dto;

import java.util.Date;

public class InvoiceDto {
    int invoiceid;
    int vetid;
    int petid;
    int userid;
    int diagnosis;
    String service;
    int price;
    Date date;
    String comments;

    public InvoiceDto() {
    }

    public InvoiceDto(int invoiceid, int vetid, int petid, int userid, int diagnosis, String service, int price, Date date, String comments) {
        this.invoiceid = invoiceid;
        this.vetid = vetid;
        this.petid = petid;
        this.userid = userid;
        this.diagnosis = diagnosis;
        this.service = service;
        this.price = price;
        this.date = date;
        this.comments = comments;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getVetid() {
        return vetid;
    }

    public void setVetid(int vetid) {
        this.vetid = vetid;
    }

    public int getPetid() {
        return petid;
    }

    public void setPetid(int petid) {
        this.petid = petid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(int diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
