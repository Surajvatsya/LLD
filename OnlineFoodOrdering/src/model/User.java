package model;

import java.time.LocalDateTime;
import java.util.List;

public class User extends Base{

    private String name;
    private String contactNumber;
    private String email;
    private Address add;
    private List<Order>orderHistory;
    private List<Restaurant>favouirateRestaurants;


    public User(String id, String name, String contactNumber, String email, Address add) {
        super(id);
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(Order order) {
        this.orderHistory.add(order);
    }

    public List<Restaurant> getFavouirateRestaurants() {
        return favouirateRestaurants;
    }

    public void setFavouirateRestaurants(Restaurant favouirateRestaurants) {
        this.favouirateRestaurants.add(favouirateRestaurants);
    }
}
