package com.alpa.apiMaterial.schema;

public class CreationItemCall {

    private String status;
    private String itemId;

    public CreationItemCall(String status, String itemId) {
        this.status = status;
        this.itemId = itemId;
    }

    public CreationItemCall() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
