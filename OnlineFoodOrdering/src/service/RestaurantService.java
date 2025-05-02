package service;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import repository.RestaurantRepository; // Updated import
import exception.RestaurantRegistrationException; // Add import

// Removed SLF4j imports as library is not present

public class RestaurantService implements GenericRestaurantService {

    // Removed SLF4j logger field
    private final RestaurantRepository restaurantRepository; // Updated type and name

    // Constructor for Dependency Injection
    public RestaurantService(RestaurantRepository restaurantRepository) { // Updated parameter type and name
        this.restaurantRepository = restaurantRepository; // Updated assignment
    }

    @Override
    // Add throws clause to match interface
    public void register(Restaurant restaurant) throws RestaurantRegistrationException {
        // Basic validation
        if (restaurant == null) {
            throw new RestaurantRegistrationException("Restaurant object cannot be null.");
        }
        if (restaurant.getId() == null || restaurant.getId().trim().isEmpty()) {
            // Assuming ID should be provided or generated before service layer
            throw new RestaurantRegistrationException("Restaurant ID cannot be null or empty.");
        }
        if (restaurant.getName() == null || restaurant.getName().trim().isEmpty()) {
            throw new RestaurantRegistrationException("Restaurant name cannot be null or empty.");
        }
        // Add more validation as needed (e.g., address, etc.)

        try {
            // Attempt to register using the repository
            restaurantRepository.register(restaurant);
            // System.out.println("Restaurant registered: " + restaurant.getId()); // Logging placeholder
        } catch (Exception e) {
            // Catch potential exceptions from the repository (e.g., duplicate ID)
            // and wrap them in the service-specific exception.
            // System.err.println("Repository error during registration: " + e.getMessage()); // Logging placeholder
            throw new RestaurantRegistrationException("Failed to register restaurant with ID " + restaurant.getId() + ": " + e.getMessage(), e);
        }
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        // Basic input validation
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant ID cannot be null or empty.");
        }
        // System.out.println("Fetching restaurant with ID: " + id); // Logging placeholder
        try {
            Restaurant restaurant = restaurantRepository.getRestaurantById(id);
            if (restaurant == null) {
                 // This case might be handled by the repository throwing RestaurantNotFoundException already.
                 // If the repository returns null instead, we throw it here.
                 throw new RestaurantNotFoundException("Restaurant not found with ID: " + id);
            }
            return restaurant;
        } catch (RestaurantNotFoundException e) {
            // Re-throw the specific exception from the repository
            throw e;
        } catch (Exception e) {
            // Catch other potential repository exceptions
            // System.err.println("Error fetching restaurant " + id + ": " + e.getMessage()); // Logging placeholder
            // Consider wrapping in a different service-level exception if needed
            throw new RuntimeException("An unexpected error occurred while fetching restaurant " + id, e);
        }
    }
    
    // Add other service methods here, e.g., updateRestaurant, searchRestaurants, etc.
}
