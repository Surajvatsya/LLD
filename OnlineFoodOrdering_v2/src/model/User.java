package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User extends Base{

    private String name;
    private String mobile;
    private final List<Restaurant>faviourateRestuarants;
    private final List<Order>orderList;
    private Address address;

    public User(String id, LocalDateTime createdAt, String name, Address address, String mobile) {
        super(id, createdAt);
        this.name = name;
        this.address = address;
        this.orderList = new ArrayList<>();
        this.faviourateRestuarants = new ArrayList<>();;
        this.mobile = mobile;
    }

    public List<Restaurant> getFaviourateRestuarants() {
        return Collections.unmodifiableList(faviourateRestuarants);
    }

    public List<Order> getOrderList() {
        return  Collections.unmodifiableList(orderList);
    }

    public void addFaviourateRestuarants(Restaurant faviourateRestuarant) {
        this.faviourateRestuarants.add(faviourateRestuarant);
    }

    public void addOrderList(Order order) {
        this.orderList.add(order);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", faviourateRestuarants=" + faviourateRestuarants +
                ", orderList=" + orderList +
                ", address=" + address +
                '}';
    }
}
