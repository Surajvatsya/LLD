package controller;

import exception.RestaurantNotFoundException;
import model.Restaurant;
import service.GenericRestaurantService;

public class RestaurantController {
//    void create
    private GenericRestaurantService restaurantService;

    public RestaurantController(GenericRestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public void createRestaurant(Restaurant restaurant){
        restaurantService.register(restaurant);
    }

    public Restaurant getRestaurantById(String id) throws RestaurantNotFoundException {
        return restaurantService.getRestaurantById(id);
    }

}
