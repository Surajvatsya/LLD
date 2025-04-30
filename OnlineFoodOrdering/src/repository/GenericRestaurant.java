package repository;

import exception.RestaurantNotFoundException;
import model.Restaurant;

public interface GenericRestaurant {
    void register(Restaurant restaurant);
    Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;
}
