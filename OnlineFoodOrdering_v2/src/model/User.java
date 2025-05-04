package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User extends Base{

    private String name;
    private String mobile;
    // Fixed typo
    private final List<Restaurant> favoriteRestaurants;
    private final List<Order> orderList;
    private Address address;

    public User(String id, LocalDateTime createdAt, String name, Address address, String mobile) {
        super(id, createdAt);
        this.name = name;
        this.address = address;
        this.orderList = new ArrayList<>();
        // Fixed typo, removed extra semicolon
        this.favoriteRestaurants = new ArrayList<>();
        this.mobile = mobile;
    }

    // Fixed typo in getter name
    public List<Restaurant> getFavoriteRestaurants() {
        return Collections.unmodifiableList(favoriteRestaurants);
    }

    public List<Order> getOrderList() {
        return Collections.unmodifiableList(orderList);
    }

    // Fixed typo in method name and parameter name, made singular
    public void addFavoriteRestaurant(Restaurant favoriteRestaurant) {
        // Optional: Add null check for favoriteRestaurant
        this.favoriteRestaurants.add(favoriteRestaurant);
    }

    public void addOrder(Order order) { // Renamed for consistency
        // Optional: Add null check for order
        this.orderList.add(order);
    }

    // Added getters for name and mobile
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    // Added setters for name and mobile (optional, depends on mutability needs)
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Optional: Add null check for address
    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        // Fixed typo in toString
        return "User{" +
                "id='" + getId() + '\'' + // Added id from Base
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", favoriteRestaurants=" + favoriteRestaurants +
                ", orderList=" + orderList +
                ", address=" + address +
                '}';
    }
}
