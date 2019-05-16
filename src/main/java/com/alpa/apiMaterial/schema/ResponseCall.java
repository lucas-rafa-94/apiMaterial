package com.alpa.apiMaterial.schema;

public class ResponseCall {

    private String status;

    public ResponseCall(String status) {
        this.status = status;
    }

    public ResponseCall() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
