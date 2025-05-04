package controller;

import model.Restaurant;
import service.RestaurantService;

import java.util.List;

public class RestaurantController {
    // Removed commented code
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    // Make public, remove throws Exception and redundant try-catch
    public void addRestaurant(Restaurant restaurant) {
        if(restaurant==null || restaurant.getId()==null) {
            throw new IllegalArgumentException("Invalid restaurant data provided to controller.");
        }
        // Add try-catch for RuntimeExceptions from service layer
        try {
            restaurantService.register(restaurant);
        } catch (RuntimeException e) {
            // Log the exception here if needed
            System.err.println("Error during restaurant registration in controller: " + e.getMessage());
            // Re-throw the exception to propagate it to the caller (e.g., Main)
            throw e;
        }
    }

    // Make public, rename method, add try-catch
    public Restaurant getRestaurantById(String id) {
        if(id == null){
            throw new IllegalArgumentException("Invalid restaurant ID provided to controller.");
        }
        // Add try-catch for RuntimeExceptions from service layer
        try {
            // Service layer should handle null from repo and potentially throw RestaurantNotFoundException
            return restaurantService.getRestaurantById(id);
        } catch (RuntimeException e) {
            // Log the exception here if needed
            System.err.println("Error fetching restaurant by ID in controller: " + e.getMessage());
            // Re-throw the exception to propagate it to the caller (e.g., Main)
            throw e;
        }
    }

    // Make public and add try-catch (although less likely to throw RuntimeException here)
    public List<Restaurant> getRestaurants() {
        try {
            return restaurantService.getAllRestaurants();
        } catch (RuntimeException e) {
            // Log the exception here if needed
            System.err.println("Error fetching all restaurants in controller: " + e.getMessage());
            // Re-throw the exception to propagate it to the caller (e.g., Main)
            throw e;
        }
    }
}
