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
    public void register(Restaurant restaurant) throws IllegalArgumentException {
        if(restaurant==null || restaurant.getId()==null)
            throw new IllegalArgumentException("Invalid restaurant");
        try{
            restaurantRepo.addRestaurant(restaurant);

        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Restaurant getRestaurantByid(String id) throws IllegalArgumentException {
        if(id==null)
            throw new IllegalArgumentException("Id is null");
        try{
            return restaurantRepo.getRestaurants(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
       return  restaurantRepo.getRestaurants();

    }
}
