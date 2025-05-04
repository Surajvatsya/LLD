package repository;

import model.Restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class RestaurantrepoImp implements RestaurantRepo{

    private final ConcurrentHashMap<String, Restaurant> restaurantConcurrentHashMap;

    public RestaurantrepoImp() {
        restaurantConcurrentHashMap = new ConcurrentHashMap<>();
    }

    @Override
    public void addRestaurant(Restaurant restaurant) throws IllegalArgumentException {
        if(restaurant==null || restaurant.getId()==null)
            throw new IllegalArgumentException("Invalid restaurant arguments");
        restaurantConcurrentHashMap.put(restaurant.getId(),restaurant);
    }

    @Override
    public Restaurant getRestaurants(String id) throws IllegalArgumentException {
       if(id==null)
           throw new IllegalArgumentException("Id is null");

       Restaurant restaurant = restaurantConcurrentHashMap.get(id);
       if(restaurant==null)
           throw  new IllegalArgumentException("restaurant not found");
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
