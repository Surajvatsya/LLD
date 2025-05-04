package controller;

import model.Restaurant;
import service.RestaurantService;

import java.util.List;

public class RestaurantController {
//    void re
    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    void addRestaurant(Restaurant restaurant) throws Exception{
        if(restaurant==null || restaurant.getId()==null)
            throw new IllegalArgumentException("Invalid restaurant");
        try{
            restaurantService.register(restaurant);
        }
        catch (Exception e){
            throw new Exception(e);
        }
    }

    Restaurant getRestaurantByid(String id) throws Exception{
        if(id == null){
            throw new IllegalArgumentException("id is null");
        }
        try{
            return restaurantService.getRestaurantByid(id);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    List<Restaurant> getRestaurants(){

            return restaurantService.getAllRestaurants();

    }
}
