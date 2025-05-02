package controller;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import service.GenericRestaurantService;

public class RestaurantController {
    private final GenericRestaurantService restaurantService; // Made final

    public RestaurantController(GenericRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public void createRestaurant(Restaurant restaurant){
        try {
            restaurantService.register(restaurant);
            System.out.println("Restaurant registered successfully: " + restaurant.getId()); // Optional success message
        } catch (Exception e) { // Catch the specific RestaurantRegistrationException
            // Handle registration exception (e.g., log, inform caller)
            System.err.println("Restaurant registration failed: " + e.getMessage());
            // Depending on requirements, might re-throw a controller-level exception
        }
    }

    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        return restaurantService.getRestaurantById(id);
    }

}
