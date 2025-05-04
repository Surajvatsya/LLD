package service;

import model.Restaurant;
import repository.RestaurantRepo;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{

    private final RestaurantRepo restaurantRepo ;

    public RestaurantServiceImpl(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }

    @Override
    // Removed throws declaration
    public void register(Restaurant restaurant) {
        // Removed redundant null check
        // if(restaurant==null || restaurant.getId()==null)
        //     throw new IllegalArgumentException("Invalid restaurant");

        // Removed try-catch that wrapped repo exception in RuntimeException
        // Let repo exceptions (like RestaurantAlreadyExistsException) propagate
        restaurantRepo.addRestaurant(restaurant);
    }

    @Override
    // Renamed method, removed throws declaration
    public Restaurant getRestaurantById(String id) {
        // Removed redundant null check
        // if(id==null)
        //     throw new IllegalArgumentException("Id is null");

        // Removed try-catch. Let repo handle "not found" appropriately.
        // Call the (soon-to-be-renamed) repo method getRestaurantById
        Restaurant restaurant = restaurantRepo.getRestaurantById(id); // Changed repo method name here

        // TODO: Add handling here if repo returns null (e.g., throw RestaurantNotFoundException)
        // if (restaurant == null) {
        //    throw new RestaurantNotFoundException("Restaurant not found with id: " + id); // Assuming RestaurantNotFoundException exists
        // }
        return restaurant; // This might return null if repo returns null
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
       return  restaurantRepo.getRestaurants();

    }
}
