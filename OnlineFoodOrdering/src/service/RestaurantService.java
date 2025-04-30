package service;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import repository.GenericRestaurent;

public class RestaurantService implements GenericRestaurantService{

    GenericRestaurent restaurentRepo;

    @Override
    public void register(Restaurant restaurant) {
        restaurentRepo.register(restaurant);
    }

    @Override
    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        return restaurentRepo.getRestaurantById(id);
    }
}
