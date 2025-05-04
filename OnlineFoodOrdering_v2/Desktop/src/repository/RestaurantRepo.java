package repository;

import model.Restaurant;

import java.util.List;

public interface RestaurantRepo {
    void addRestaurant(Restaurant restaurant) throws IllegalArgumentException;
    Restaurant getRestaurants(String id) throws IllegalArgumentException;
    List<Restaurant> getRestaurants() ;
}
