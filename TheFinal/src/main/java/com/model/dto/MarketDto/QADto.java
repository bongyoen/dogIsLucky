package com.model.dto.MarketDto;

import java.util.Date;

public class QADto {
    int qaId;
    int userId;
    String question;
    Date qDate;
    int supplierId;
    String answer;
    Date aDate;

    public QADto(){}

    public QADto(int qaId, int userId, String question, Date qDate, int supplierId, String answer, Date aDate) {
        this.qaId = qaId;
        this.userId = userId;
        this.question = question;
        this.qDate = qDate;
        this.supplierId = supplierId;
        this.answer = answer;
        this.aDate = aDate;
    }

    public int getQaId() {
        return qaId;
    }

    public void setQaId(int qaId) {
        this.qaId = qaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getqDate() {
        return qDate;
    }

    public void setqDate(Date qDate) {
        this.qDate = qDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }
}
