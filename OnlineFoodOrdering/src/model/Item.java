package model;

import java.math.BigDecimal; // Added import

// Represents an item (dish) on a menu
public class Item {
    // TODO: Consider extending Base if Item needs createdAt/updatedAt
    private final String id; // Made final
    private String dishName;
    private int availableQuantity;
    private final boolean isVeg; // Made final
    // Removed isAvailable field; derived from availableQuantity
    private BigDecimal price; // Added price field

    /**
     * Constructor for Item.
     * @param id Unique ID for the item.
     * @param dishName Name of the dish.
     * @param price Price of the item.
     * @param availableQuantity Initial available quantity.
     * @param isVeg Whether the item is vegetarian.
     */
    public Item(String id, String dishName, BigDecimal price, int availableQuantity, boolean isVeg) {
        // Note: Removed isAvailable parameter as it's now derived
        this.id = id;
        this.dishName = dishName;
        this.price = price; // Initialize price
        this.availableQuantity = availableQuantity;
        this.isVeg = isVeg;
    }

    public String getId() {
        return id;
    }

    // Removed setId as id is final

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

    // Added getter for price
    public BigDecimal getPrice() {
        return price;
    }

    // Added setter for price
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    // Removed setVeg as isVeg is final

    /**
     * Checks if the item is available based on quantity.
     * @return true if availableQuantity > 0, false otherwise.
     */
    public boolean isAvailable() {
        // Derived availability from quantity
        return this.availableQuantity > 0;
    }

    // Removed setAvailable as isAvailable is derived
}
