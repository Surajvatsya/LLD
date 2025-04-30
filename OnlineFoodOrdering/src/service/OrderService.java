package service;

import model.Order;
import model.OrderStatus;
import repository.GenericOrder;

public class OrderService implements GenericOrderService{

    GenericOrder orderRepo;

    @Override
    public void createOrder(Order order) {
        orderRepo.createOrder(order);
    }

    @Override
    public Order getOrder(String orderId) {
       return orderRepo.getOrder(orderId);
    }

    @Override
    public void cancelOrder(String orderId) {
        Order order = orderRepo.getOrder(orderId);
        order.setOrderStatus(OrderStatus.CANCELLED);
    }

    @Override
    public void reOrder(String orderId) {
        Order order = orderRepo.getOrder(orderId);

        //think here to maintain history
       orderRepo.createOrder(order);

    }
}
