package com.model.dto.MarketDto;

public class OptionDto {
    int optionId;
    String options;

    public OptionDto(){}

    public OptionDto(int optionId, String options) {
        this.optionId = optionId;
        this.options = options;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
