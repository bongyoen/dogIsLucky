package com.model.dto.MarketDto.StatusDto;

public class ProgressDto {
    int progressId;
    String progress;

    public ProgressDto(){}

    public ProgressDto(int progressId, String progress) {
        this.progressId = progressId;
        this.progress = progress;
    }

    public int getProgressId() {
        return progressId;
    }

    public void setProgressId(int progressId) {
        this.progressId = progressId;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }
}
