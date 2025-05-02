package repository;

import exception.RestaurantNotFoundException;
import model.Restaurant;

import java.util.HashMap;
// Consider using ConcurrentHashMap for thread safety if needed
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.ConcurrentMap;

// Updated to implement renamed interface
public class RestaurantRepo implements RestaurantRepository {

    // private final ConcurrentMap<String, Restaurant> restaurantMap = new ConcurrentHashMap<>();
    private final HashMap<String, Restaurant> restaurantHashMap = new HashMap<>(); // Made final

    @Override
    public void register(Restaurant restaurant) {
        // Added null checks
        if (restaurant == null || restaurant.getId() == null) {
            throw new IllegalArgumentException("Restaurant and Restaurant ID cannot be null.");
        }
        // Note: Currently overwrites if ID exists. Consider throwing exception for duplicates if needed.
        restaurantHashMap.put(restaurant.getId(), restaurant);
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        // Added null check for ID
        if (id == null) {
            throw new IllegalArgumentException("Restaurant ID cannot be null.");
        }
        Restaurant restaurant = restaurantHashMap.get(id); // Use get() directly, it returns null if key not found
        if (restaurant != null) {
            return restaurant;
        }
        // Removed System.out.println for cleaner separation of concerns
        throw new RestaurantNotFoundException("No restaurant found with ID: " + id);
    }
}
