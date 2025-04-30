package repository;

import exception.RestaurantNotFoundException;
import model.Restaurant;

import java.util.HashMap;

public class RestaurantRepo implements GenericRestaurent{

    private HashMap<String,Restaurant> restaurantHashMap = new HashMap<>();
    @Override
    public void register(Restaurant restaurant) {
        restaurantHashMap.put(restaurant.getId(), restaurant);
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        if(restaurantHashMap.containsKey(id))
         return restaurantHashMap.get(id);
        System.out.println("No restaurant with given Id");
        throw new RestaurantNotFoundException("No restaurant with given Id");
//        return null;
    }
}
