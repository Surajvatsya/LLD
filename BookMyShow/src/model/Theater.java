package model;

import java.util.List;

public class Theater {
    private String name;
    private Address address;
    private double rating;
    private List<Screen>screens;

    public Theater(String name, Address address, List<Screen> screens) {
        this.name = name;
        this.address = address;
        this.screens = screens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

//    public double setRating(Rating rating) {
//        this.rating = rating;
//    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(Screen screens) {
        this.screens.add(screens);
    }
}
