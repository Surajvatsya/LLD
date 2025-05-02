package service;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import exception.RestaurantRegistrationException; // Import the new exception

public interface GenericRestaurantService {
    // Declare exception for registration failures
    void register(Restaurant restaurant) throws RestaurantRegistrationException;
    Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;
}
