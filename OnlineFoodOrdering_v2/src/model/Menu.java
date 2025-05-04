package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu extends Base{
    private String restaurantId;
    private List<Item> itemList;

    public Menu(String id, LocalDateTime createdAt, String restaurantId) {
        super(id, createdAt);
        this.restaurantId = restaurantId;
        this.itemList = new ArrayList<>();
    }

    // Ensure getter returns unmodifiable list (already correct)
    public List<Item> getItemList() {
        return Collections.unmodifiableList(itemList);
    }

    // Add null check for item
    public void addItem(Item item) {
        if (item != null) {
            this.itemList.add(item);
        }
    }

    // Added getter for restaurantId
    public String getRestaurantId() {
        return restaurantId;
    }

    // Added toString method
    @Override
    public String toString() {
        return "Menu{" +
                "id='" + getId() + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", itemList=" + itemList +
                '}';
    }
}
