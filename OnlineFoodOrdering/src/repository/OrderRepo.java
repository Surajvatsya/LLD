package repository;

import model.Order;
import model.User;

import model.Order;
// import model.User; // Unused import

import java.util.HashMap;
// Consider using ConcurrentHashMap for thread safety if needed
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.ConcurrentMap;

public class OrderRepo implements GenericOrder {

    // private final ConcurrentMap<String, Order> orderMap = new ConcurrentHashMap<>();
    private final HashMap<String, Order> orderHashMap = new HashMap<>(); // Made final

    @Override
    public void createOrder(Order order) {
        if (order != null && order.getId() != null) { // Added null checks
            orderHashMap.put(order.getId(), order);
        }
    }

    @Override
    public Order getOrder(String orderId) {
        if (orderId == null) { // Added null check
            return null;
        }
        // Consider throwing OrderNotFoundException if null is returned
        return orderHashMap.get(orderId);
    }

//    @Override
//    public void cancelOrder(String orderId) {
//        orderHashMap.remove(orderId);
//    }

}
