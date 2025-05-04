package model;

import java.time.LocalDateTime;

public class Item extends Base{

    private String name;
    private final Boolean isVeg;
    private int availableQuantity;

    public Item(String id, LocalDateTime createdAt, String name, Boolean isVeg, int availableQuantity) {
        super(id, createdAt);
        this.name = name;
        this.isVeg = isVeg;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
