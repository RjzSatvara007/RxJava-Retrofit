package com.rjz.rxandroidretrofit.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<OrdersHistory> getOrdersHistory() {
        return ordersHistory;
    }

    public void setOrdersHistory(List<OrdersHistory> ordersHistory) {
        this.ordersHistory = ordersHistory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}