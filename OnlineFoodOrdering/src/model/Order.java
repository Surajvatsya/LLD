package model;

import java.util.List;

public class Order extends Base{

    private String userId;
    private double totalAmount;
    private OrderStatus orderStatus;
    private List<Item> dishList;
    private String restaurantId;

    public Order(String id, String userId, double totalAmount, OrderStatus orderStatus, List<Item> dishList, String restaurantId) {
        super(id);
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.dishList = dishList;
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
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

    public void setDishList(List<Item> dishList) {
        this.dishList = dishList;
    }
}
