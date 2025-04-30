package model;

public class Restaurant {
    private final String id;
    private String name;
    private Address address;
    private Menu menu;
    private double avgRating;
    private boolean isOpen;

    public Restaurant(String id, String name, Address address, Menu menu) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.isOpen = true;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getId() {
        return id;
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

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }
}
