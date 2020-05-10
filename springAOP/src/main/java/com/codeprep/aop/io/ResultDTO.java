package com.codeprep.aop.io;

public class ResultDTO {

    private Boolean value = Boolean.FALSE;

    public ResultDTO(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
