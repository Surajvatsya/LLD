package repository;

import model.Order;
import model.User;

import java.util.HashMap;

public class OrderRepo implements GenericOrder{

    private HashMap<String, Order> orderHashMap = new HashMap<>();

    @Override
    public void createOrder(Order order) {
        orderHashMap.put(order.getId(), order);
    }

    @Override
    public Order getOrder(String orderId) {
       return orderHashMap.get(orderId);
    }

//    @Override
//    public void cancelOrder(String orderId) {
//        orderHashMap.remove(orderId);
//    }

}
