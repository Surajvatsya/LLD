package service;

import model.Restaurant;

import java.util.List;

public interface RestaurantService {
    void register(Restaurant restaurant) throws IllegalArgumentException;
    Restaurant getRestaurantByid(String id) throws IllegalArgumentException;
    List<Restaurant>getAllRestaurants();
}
