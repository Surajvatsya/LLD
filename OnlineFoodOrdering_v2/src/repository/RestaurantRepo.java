package repository;

import model.Restaurant;

import model.Restaurant;
// Optional: Define custom exceptions like RestaurantNotFoundException, RestaurantAlreadyExistsException here or in a separate exceptions package

import java.util.List;

public interface RestaurantRepo {
    // Removed optional 'throws IllegalArgumentException'
    // Implementation should throw specific exception (e.g., RestaurantAlreadyExistsException) on failure.
    void addRestaurant(Restaurant restaurant);

    // Renamed method, removed optional 'throws IllegalArgumentException'
    // Implementation should return null or throw specific RestaurantNotFoundException if not found.
    // Choosing to return Restaurant (potentially null) for now. Service layer must handle null.
    Restaurant getRestaurantById(String id);

    List<Restaurant> getRestaurants();
}
