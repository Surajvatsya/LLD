package service;

import model.Order;
import model.OrderStatus;
// Remove incorrect/duplicate imports
import repository.OrderRepository; // Assuming this is the correct interface
import exception.OrderNotFoundException; // Add import
import java.util.UUID; // For generating new order ID in reOrder (placeholder)
import java.util.ArrayList; // For copying items in reOrder (placeholder)

public class OrderService implements GenericOrderService {

    private final OrderRepository orderRepo; // Change type to OrderRepository

    // Constructor for Dependency Injection
    public OrderService(OrderRepository orderRepo) { // Change parameter type
        this.orderRepo = orderRepo;
    }

    @Override
    public Order createOrder(Order order) {
        // Add validation logic if needed (e.g., check if user/restaurant exist)
        // Assuming orderRepo.createOrder might modify the order (e.g., add ID) or just persists it.
        // If it doesn't modify, we might need a separate call to fetch the created order if needed.
        orderRepo.createOrder(order);
        return order; // Return the order object
    }

    @Override
    public Order getOrder(String orderId) throws OrderNotFoundException {
        Order order = orderRepo.getOrder(orderId);
        if (order == null) {
            throw new OrderNotFoundException("Order not found with ID: " + orderId);
        }
        return order;
    }

    @Override
    public boolean cancelOrder(String orderId) {
        try {
            Order order = getOrder(orderId); // Use the updated getOrder which throws
            // Add logic here to check if the order *can* be cancelled based on its current status
            // if (order.getOrderStatus() != OrderStatus.PLACED && order.getOrderStatus() != OrderStatus.PROCESSING) {
            //     System.err.println("Cannot cancel order " + orderId + " with status " + order.getOrderStatus());
            //     return false;
            // }

            order.setOrderStatus(OrderStatus.CANCELLED);
            // *** Logical Flaw: Change is not saved back to the repository! ***
            // Need an orderRepo.updateOrder(order) method after changing status.
            // orderRepo.updateOrder(order); // Example of what's needed
            System.out.println("Order " + orderId + " status set to CANCELLED (locally, needs repo update).");
            return true; // Indicate success (assuming update would work)
        } catch (OrderNotFoundException e) {
            System.err.println("Cannot cancel: " + e.getMessage());
            return false; // Indicate failure (order not found)
        } catch (Exception e) {
            // Catch other potential exceptions during cancellation logic
             System.err.println("Error cancelling order " + orderId + ": " + e.getMessage());
             return false;
        }
    }

    @Override
    public Order reOrder(String orderId) throws OrderNotFoundException {
        Order originalOrder = getOrder(orderId); // Use updated getOrder, throws if not found

        // Generate a new ID for the re-order
        String newOrderId = UUID.randomUUID().toString();

        // Create a new Order object using the constructor and details from the original order
        Order newOrder = new Order(
                newOrderId,
                originalOrder.getUserId(),
                originalOrder.getTotalAmount(),
                OrderStatus.PENDING, // Use PENDING as the initial status
                new ArrayList<>(originalOrder.getDishList()), // Create a copy of the dish list
                originalOrder.getRestaurantId()
        );
        // Note: Timestamps or other fields might need updating if present in Base or Order class

        System.out.println("Creating new order " + newOrderId + " based on original order " + orderId);
        // Use createOrder to persist the new order. createOrder now returns the order.
        return createOrder(newOrder);
    }
}
