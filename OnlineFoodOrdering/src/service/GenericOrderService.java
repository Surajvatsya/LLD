package service;

import model.Order;

public interface GenericOrderService {
    void createOrder(Order order);
    Order getOrder(String orderId);
    void cancelOrder(String orderId);
    void reOrder(String orderId);
}
