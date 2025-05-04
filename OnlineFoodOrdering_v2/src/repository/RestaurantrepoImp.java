package repository;

import model.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Renamed class to fix typo
public class RestaurantRepoImp implements RestaurantRepo{

    private final ConcurrentHashMap<String, Restaurant> restaurantConcurrentHashMap;

    public RestaurantRepoImp() {
        restaurantConcurrentHashMap = new ConcurrentHashMap<>();
    }

    @Override
    // Removed throws declaration
    public void addRestaurant(Restaurant restaurant) {
        // Removed redundant null check
        // if(restaurant==null || restaurant.getId()==null)
        //     throw new IllegalArgumentException("Invalid restaurant arguments");

        // Use putIfAbsent for atomic check-and-put, prevent overwriting
        if (restaurantConcurrentHashMap.putIfAbsent(restaurant.getId(), restaurant) != null) {
            // Consider creating a specific RestaurantAlreadyExistsException
            throw new IllegalArgumentException("Restaurant with ID " + restaurant.getId() + " already exists.");
        }
        // Removed old: restaurantConcurrentHashMap.put(restaurant.getId(),restaurant);
    }

    @Override
    // Renamed method, removed throws declaration
    public Restaurant getRestaurantById(String id) {
       // Removed redundant null check
       // if(id==null)
       //     throw new IllegalArgumentException("Id is null");

       // Get restaurant from map
       Restaurant restaurant = restaurantConcurrentHashMap.get(id);

       // Return null if restaurant not found (instead of throwing IllegalArgumentException)
       // Service layer is responsible for handling the null case
       // Removed old:
       // if(restaurant==null)
       //     throw  new IllegalArgumentException("restaurant not found");
       return restaurant;
    }

    @Override
    public List<Restaurant> getRestaurants() {
        final List<Restaurant> restaurantList = new ArrayList<>();
        for(Restaurant restaurant : restaurantConcurrentHashMap.values()){
            restaurantList.add(restaurant);
        }
        return Collections.unmodifiableList(restaurantList);
    }
}
