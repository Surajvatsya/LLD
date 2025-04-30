package repository;

import model.Order;

public interface GenericOrder {
    void createOrder(Order order);
    Order getOrder(String orderId);
//    void cancelOrder(String orderId);
}
