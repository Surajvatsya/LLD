package model;

import java.math.BigDecimal; // Added import

// Represents a line item within an Order, linking a specific dish (Item) with quantity and price at the time of order.
public class OrderItem {
    // TODO: Consider extending Base if OrderItem needs its own ID, createdAt etc.
    // TODO: Consider storing 'private final Item item;' instead of just dishId for easier access to item details.

    private final String dishId;  // Renamed, made final
    private final int quantity;   // Made final
    private final BigDecimal priceAtOrderTime; // Added price, made final

    /**
     * Constructor for OrderItem.
     * @param orderId The ID of the order this item belongs to.
     * @param dishId The ID of the dish (Item) ordered.
     * @param quantity The quantity ordered.
     * @param priceAtOrderTime The price of a single unit of the item at the time the order was placed.
     */
    public OrderItem(String orderId, String dishId, int quantity, BigDecimal priceAtOrderTime) {
        // Add null/validation checks if needed (e.g., quantity > 0, price >= 0)
        // this.orderId = orderId;
        this.dishId = dishId;
        this.quantity = quantity;
        this.priceAtOrderTime = priceAtOrderTime;
    }

    // --- Getters ---

    // public String getOrderId() {
    //     return orderId;
    // }

    public String getDishId() {
        return dishId;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPriceAtOrderTime() {
        return priceAtOrderTime;
    }

    // No setters as fields are final (representing an immutable line item once created)
}
// Removed trailing comments
