package service;

import model.Restaurant;

import model.Restaurant;
// Optional: Define custom exceptions like RestaurantNotFoundException, RestaurantAlreadyExistsException here or in a separate exceptions package

import java.util.List;

public interface RestaurantService {
    // Removed optional 'throws IllegalArgumentException'
    void register(Restaurant restaurant);

    // Renamed method, removed optional 'throws IllegalArgumentException'
    // Consider changing return type to Optional<Restaurant> or throwing a specific RestaurantNotFoundException
    Restaurant getRestaurantById(String id);

    List<Restaurant> getAllRestaurants();
}
