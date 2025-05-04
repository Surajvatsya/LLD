package model;

import java.math.BigDecimal; // Added import
import java.time.LocalDateTime;
import java.util.Objects; // Added import

public class Item extends Base{

    private String name;
    private final boolean isVeg; // Changed to primitive boolean
    private int availableQuantity;
    private BigDecimal price; // Added price field using BigDecimal

    // Updated constructor signature for isVeg (boolean)
    public Item(String id, LocalDateTime createdAt, String name, boolean isVeg, int availableQuantity, BigDecimal price) {
        super(id, createdAt);
        // Use Objects.requireNonNull for non-primitive constructor args if they shouldn't be null
        this.name = Objects.requireNonNull(name, "Item name cannot be null");
        this.isVeg = isVeg; // Assign primitive boolean directly
        this.availableQuantity = availableQuantity; // Primitive, no null check needed
        // Add validation for price if needed (e.g., non-negative)
        this.price = Objects.requireNonNull(price, "Item price cannot be null");
        if (price.compareTo(BigDecimal.ZERO) < 0) {
             throw new IllegalArgumentException("Item price cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    // Renamed getter for primitive boolean
    public boolean isVeg() {
        return isVeg;
    }

    // Added getter for price
    public BigDecimal getPrice() {
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    // Removed generic setter
    // public void setAvailableQuantity(int availableQuantity) {
    //     this.availableQuantity = availableQuantity;
    // }

    // Added specific methods with validation
    public void decreaseQuantity(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to decrease must be non-negative.");
        }
        if (this.availableQuantity < amount) {
            // Consider a custom InsufficientQuantityException
            throw new IllegalStateException("Insufficient quantity available for item: " + getName() + " (Requested: " + amount + ", Available: " + this.availableQuantity + ")");
        }
        this.availableQuantity -= amount;
    }

    public void increaseQuantity(int amount) {
         if (amount < 0) {
            throw new IllegalArgumentException("Amount to increase must be non-negative.");
        }
        this.availableQuantity += amount;
    }

    // Added toString method
    @Override
    public String toString() {
        return "Item{" +
                "id='" + getId() + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isVeg=" + isVeg +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}



// That's a great question! I changed isVeg from the wrapper class Boolean to the primitive type boolean based on the typical meaning of this field in a food ordering context. Here's the reasoning:

// Boolean (Wrapper) vs. boolean (Primitive):

// A Boolean object can hold three possible values: true, false, or null.
// A boolean primitive can only hold true or false.
// Meaning of null for isVeg:

// The key difference is the possibility of null. For the isVeg flag on a food item, does null represent a meaningful state? Usually, an item is definitively either vegetarian (true) or not (false). A null value might imply "unknown" or "not specified," which isn't typically how this flag is used in menus.
// Benefits of boolean here:

// Clarity: It enforces that every Item must be explicitly marked as either vegetarian or not. There's no ambiguous null state.
// Safety: Using the primitive boolean eliminates the risk of encountering a NullPointerException if code tries to access the value of isVeg without first checking if it's null.
// Simplicity/Performance: Primitives are generally slightly more memory-efficient and can be faster to work with than their wrapper counterparts, although this is often a minor factor.
// Therefore, unless there's a specific requirement for an "unknown" or "not applicable" state for the vegetarian status (which would be represented by null), using the primitive boolean makes the model clearer, safer, and more directly represents the two expected states (true or false).