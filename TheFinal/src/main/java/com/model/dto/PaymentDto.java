package com.model.dto;

public class PaymentDto {
    int paymentid;
    int userid;
    int invoiceid;
    int methodid;

    public PaymentDto() {
    }

    public PaymentDto(int paymentid, int userid, int invoiceid, int methodid) {
        this.paymentid = paymentid;
        this.userid = userid;
        this.invoiceid = invoiceid;
        this.methodid = methodid;
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getMethodid() {
        return methodid;
    }

    public void setMethodid(int methodid) {
        this.methodid = methodid;
    }
}
