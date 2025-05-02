package model;

/**
 * Represents the possible statuses of an Order.
 */
public enum OrderStatus {
    PENDING, // Order placed, awaiting restaurant confirmation/processing
    ACCEPTED, // Restaurant accepted the order
    PREPARING, // Restaurant is preparing the order
    READY_FOR_PICKUP, // Order is ready for pickup (if applicable)
    OUT_FOR_DELIVERY, // Order is out for delivery
    DELIVERED, // Order successfully delivered
    CANCELLED, // Order was cancelled
    FAILED // Order failed (e.g., payment failure, restaurant rejection)

    // Add/remove/rename statuses based on the specific application workflow.
    // Consider adding display names if needed for UI:
    // PENDING("Pending"), DELIVERED("Delivered"), CANCELLED("Cancelled");
    // private final String displayName;
    // OrderStatus(String displayName) { this.displayName = displayName; }
    // public String getDisplayName() { return displayName; }
}
