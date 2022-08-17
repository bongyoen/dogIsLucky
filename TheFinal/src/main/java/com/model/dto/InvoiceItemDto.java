package com.model.dto;

import java.util.Date;

public class InvoiceItemDto {
    int itemid;
    int invoiceid;
    int clientid;
    Date createdate;
    String items;
    int quantity;
    int unitprice;
    int amount;
    int tax;

    public InvoiceItemDto() {
    }

    public InvoiceItemDto(int itemid, int invoiceid, int clientid, Date createdate, String items, int quantity, int unitprice, int amount, int tax) {
        this.itemid = itemid;
        this.invoiceid = invoiceid;
        this.clientid = clientid;
        this.createdate = createdate;
        this.items = items;
        this.quantity = quantity;
        this.unitprice = unitprice;
        this.amount = amount;
        this.tax = tax;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}
