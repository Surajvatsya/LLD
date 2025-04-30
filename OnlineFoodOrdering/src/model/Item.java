package model;

public class Item {
    private String id;
    private String dishName;
    private int availableQuantity;
    private boolean isVeg;
    private boolean isAvailable;

    public Item(String id, String dishName, int availableQuantity, boolean isVeg, boolean isAvailable) {
        this.id = id;
        this.dishName = dishName;
        this.availableQuantity = availableQuantity;
        this.isVeg = isVeg;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
