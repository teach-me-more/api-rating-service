package com.rbasystems.api.validator;

public class ValidationResult {
    private String message;
    private FailureType failureType;
    private String fieldName;

    public ValidationResult(FailureType failureType, String message) {
        this.message = message;
        this.failureType = failureType;
    }

    public String getMessage() {
        return message;
    }

    public FailureType getFailureType() {
        return failureType;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFailureType(FailureType failureType) {
        this.failureType = failureType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

}
