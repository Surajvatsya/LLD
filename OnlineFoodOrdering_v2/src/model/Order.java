package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap; // Use LinkedHashMap to maintain insertion order
import java.util.Map;
import java.util.Objects;

public class Order extends Base {

    // Inner class to hold item and quantity within the order
    public static class OrderItem {
        private final Item item;
        private int quantity;

        public OrderItem(Item item, int quantity) {
            this.item = Objects.requireNonNull(item, "Item cannot be null");
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive.");
            }
            this.quantity = quantity;
        }

        public Item getItem() {
            return item;
        }

        public int getQuantity() {
            return quantity;
        }

        // Allow updating quantity within the order context if needed
        public void setQuantity(int quantity) {
             if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be positive.");
            }
            this.quantity = quantity;
        }

        public BigDecimal calculateItemTotal() {
            return item.getPrice().multiply(BigDecimal.valueOf(quantity));
        }

        @Override
        public String toString() {
            return "OrderItem{" +
                    "item=" + item.getName() + // Show item name for readability
                    ", quantity=" + quantity +
                    '}';
        }
    }

    // Changed from List<Item> to Map<ItemId, OrderItem>
    private final Map<String, OrderItem> orderItems;
    private BigDecimal totalAmount; // Calculated field
    private final String userId; // Link back to the user who placed the order
    private final String restaurantId; // Link back to the restaurant

    // Updated constructor: Takes user and restaurant IDs, initializes empty items map
    public Order(String id, LocalDateTime createdAt, String userId, String restaurantId) {
        super(id, createdAt);
        this.userId = Objects.requireNonNull(userId, "User ID cannot be null");
        this.restaurantId = Objects.requireNonNull(restaurantId, "Restaurant ID cannot be null");
        this.orderItems = new LinkedHashMap<>(); // Use LinkedHashMap to maintain insertion order
        this.totalAmount = BigDecimal.ZERO; // Initialize total amount
    }

    // Method to add or update an item in the order
    public void addItem(Item item, int quantity) {
        Objects.requireNonNull(item, "Item cannot be null");
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }

        OrderItem existingOrderItem = orderItems.get(item.getId());
        if (existingOrderItem != null) {
            // Item already exists, update quantity
            existingOrderItem.setQuantity(existingOrderItem.getQuantity() + quantity);
        } else {
            // Add new item
            // Optional: Check if item belongs to the correct restaurantId if needed
            orderItems.put(item.getId(), new OrderItem(item, quantity));
        }
        // Recalculate total amount whenever items change
        calculateTotalAmount();
    }

    // Method to remove an item (optional)
    public void removeItem(String itemId) {
        if (orderItems.remove(itemId) != null) {
            calculateTotalAmount(); // Recalculate if removed
        }
    }

    // Method to calculate the total amount based on items and quantities
    public void calculateTotalAmount() {
        this.totalAmount = BigDecimal.ZERO;
        for (OrderItem orderItem : orderItems.values()) {
            this.totalAmount = this.totalAmount.add(orderItem.calculateItemTotal());
        }
    }

    // Getter for the calculated total amount
    public BigDecimal getTotalAmount() {
        // Ensure it's calculated if accessed directly (though addItem/removeItem should keep it updated)
        // calculateTotalAmount(); // Uncomment if direct access without modification is expected
        return totalAmount;
    }

    // Getter for user ID
    public String getUserId() {
        return userId;
    }

    // Getter for restaurant ID
    public String getRestaurantId() {
        return restaurantId;
    }

    // Return an unmodifiable view of the OrderItems map's values (the OrderItem objects)
    public Map<String, OrderItem> getOrderItems() {
        return Collections.unmodifiableMap(orderItems);
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Order{" +
                "id='" + getId() + '\'' +
                ", userId='" + userId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                ", createdAt=" + getCreatedAt() + // Added createdAt from Base
                '}';
    }
}
