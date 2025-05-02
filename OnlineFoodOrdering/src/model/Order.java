package model;

import java.util.List;
// Consider adding import java.util.ArrayList;
// Consider adding import java.util.Collections;

public class Order extends Base {

    private final String userId; // Made final
    private double totalAmount;
    private OrderStatus orderStatus;
    private final List<Item> dishList; // Made final
    private final String restaurantId; // Made final
    private List<OrderItem> orderItems; // Added field for order items -- implement it later

    public Order(String id, String userId, double totalAmount, OrderStatus orderStatus, List<Item> dishList, String restaurantId) {
        super(id);
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.dishList = dishList; // make a defensive copy here
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    // Removed setUserId as userId is final

    public double getTotalAmount() {
        return totalAmount;
    }

    // Corrected parameter type from Integer to double
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Item> getDishList() {
        return dishList;
    }

    // Removed setDishList as dishList is final

    // Added getter for final field restaurantId
    public String getRestaurantId() {
        return restaurantId;
    }
}
