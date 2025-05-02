package repository;

import model.Order;
// Consider adding OrderNotFoundException if getOrder/updateOrder throw it
// import exception.OrderNotFoundException;

import java.util.List; // Added for potential find methods

/**
 * Interface defining data access operations for Order entities.
 */
public interface OrderRepository { // Renamed from GenericOrder

    /**
     * Creates a new order.
     * Implementations should handle potential duplicate IDs.
     * @param order The order object to create. Must not be null, and order.getId() must not be null.
     * @throws IllegalArgumentException if the order or order ID is null, or potentially if an order with the same ID already exists.
     */
    void createOrder(Order order);

    /**
     * Retrieves an order by its unique ID.
     * @param orderId The ID of the order to retrieve. Must not be null.
     * @return The Order object if found, or null/throws exception if not found (depending on implementation contract).
     * @throws IllegalArgumentException if orderId is null.
     *         // Consider throwing OrderNotFoundException if not found.
     */
    Order getOrder(String orderId);

    /**
     * Updates an existing order (e.g., to change status).
     * @param order The order object with updated information. Must not be null, and order.getId() must not be null.
     * @throws IllegalArgumentException if the order or order ID is null.
     *         // Consider throwing OrderNotFoundException if the order to update doesn't exist.
     */
    void updateOrder(Order order); // Added update method

    // TODO: Consider adding other methods like deleteOrder(String orderId), findOrdersByUserId(String userId), etc.
}
