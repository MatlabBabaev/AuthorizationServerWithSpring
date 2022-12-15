package com.matlab.resourseserver;

public class OrderRest {
    private String orderId;
    private String productId;
    private String userId;
    private String quantityId;
    private OrderStatus orderStatus;

    public OrderRest(String orderId, String productId, String userId, String quantityId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.productId = productId;
        this.userId = userId;
        this.quantityId = quantityId;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public String getUserId() {
        return userId;
    }

    public String getQuantityId() {
        return quantityId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
