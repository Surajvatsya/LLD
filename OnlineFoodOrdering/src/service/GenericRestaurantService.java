package service;

import exception.RestaurantNotFoundException;
import model.Restaurant;

public interface GenericRestaurantService {
    void register(Restaurant restaurant);
    Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;
}
