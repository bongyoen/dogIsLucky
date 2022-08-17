package com.model.dto;

public class SuggestDto {
    int suggestid;
    String treatment;

    public SuggestDto() {
    }

    public SuggestDto(int suggestid, String treatment) {
        this.suggestid = suggestid;
        this.treatment = treatment;
    }

    public int getSuggestid() {
        return suggestid;
    }

    public void setSuggestid(int suggestid) {
        this.suggestid = suggestid;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
