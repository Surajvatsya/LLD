package controller;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import service.GenericRestaurantService;
import exception.RestaurantRegistrationException; // Add import

public class RestaurantController {
    private final GenericRestaurantService restaurantService; // Made final

    public RestaurantController(GenericRestaurantService restaurantService) {
        // Add null check for dependency
        if (restaurantService == null) {
            throw new IllegalStateException("RestaurantService cannot be null.");
        }
        this.restaurantService = restaurantService;
    }

    // Add throws clause and re-throw exception
    public void createRestaurant(Restaurant restaurant) throws RestaurantRegistrationException {
        // Input validation
        if (restaurant == null) {
            // Or throw IllegalArgumentException
            System.err.println("Cannot register a null restaurant.");
            // Consider throwing IllegalArgumentException here instead of just printing
            throw new IllegalArgumentException("Restaurant object cannot be null.");
        }
        try {
            restaurantService.register(restaurant);
            System.out.println("Restaurant registered successfully: " + restaurant.getId()); // Logging placeholder
        } catch (RestaurantRegistrationException e) {
            // Catch specific exception
            System.err.println("Restaurant registration failed: " + e.getMessage()); // Logging placeholder
            // Re-throw the exception to the caller
            throw e;
        }
        // Catching generic Exception might hide other unexpected runtime errors,
        // but could be added if needed for robustness.
    }

    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        // Input validation
        if (id == null || id.trim().isEmpty()) {
             throw new IllegalArgumentException("Restaurant ID cannot be null or empty.");
        }
        // The service layer already handles RestaurantNotFoundException
        return restaurantService.getRestaurantById(id);
    }

}
