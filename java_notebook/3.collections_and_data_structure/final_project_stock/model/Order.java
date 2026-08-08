package model;

import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> productList;
    private double totalOrderValue;
    private OrderStatus orderStatus;

    // Getters and Setters
    public List<OrderItem> getProductList() {
        return productList;
    }
    public void setProductList(List<OrderItem> productList) {
        this.productList = productList;
    }

    public double getTotalOrderValue() {
        return totalOrderValue;
    }
    public void setTotalOrderValue(double totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    // Constructor
    public Order(String orderId, List<OrderItem> productList, double totalOrderValue, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.productList = productList;
        this.totalOrderValue = totalOrderValue;
        this.orderStatus = orderStatus;
    }
}
