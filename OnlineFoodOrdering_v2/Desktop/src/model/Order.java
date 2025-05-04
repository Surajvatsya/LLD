package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order extends Base{

    private final List<Item>itemList;
    private int totalAmount;
    private String restaurantName;

    public Order(String id, LocalDateTime createdAt, int totalAmount, String restaurantName) {
        super(id, createdAt);
        this.itemList = new ArrayList<>();
        this.totalAmount = totalAmount;
        this.restaurantName = restaurantName;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getRestaurantName() {
        return restaurantName;
    }


}
