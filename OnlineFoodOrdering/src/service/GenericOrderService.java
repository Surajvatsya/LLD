package service;

import model.Order;
import exception.OrderNotFoundException; // Import the new exception

public interface GenericOrderService {
    // Return the created order
    Order createOrder(Order order);
    // Declare exception if order not found
    Order getOrder(String orderId) throws OrderNotFoundException;
    // Return boolean for success/failure
    boolean cancelOrder(String orderId);
    // Return the new order, declare exception if original not found
    Order reOrder(String orderId) throws OrderNotFoundException;
}
