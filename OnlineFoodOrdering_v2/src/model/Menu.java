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

    public List<Item> getItemList() {
        return Collections.unmodifiableList(itemList);
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }
}
