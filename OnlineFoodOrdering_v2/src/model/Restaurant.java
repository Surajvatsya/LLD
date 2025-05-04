package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections; // Added import
import java.util.List;

public class Restaurant extends Base{

    private String name;
    private String mobile;
    private Menu menu; // Removed comment
    private Address address;
    private final List<Address> serviceAreas;
    // Removed comment


    public Restaurant(String id, LocalDateTime createdAt, String name, String mobile, Menu menu, Address address) {
        super(id, createdAt);
        this.name = name;
        this.mobile = mobile;
        this.menu = menu;
        this.address = address;
        this.serviceAreas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Added getter for mobile
    public String getMobile() {
        return mobile;
    }

    // Return unmodifiable list
    public List<Address> getServiceAreas() {
        return Collections.unmodifiableList(serviceAreas);
    }

    // Added method to add service areas
    public void addServiceArea(Address area) {
        if (area != null) {
            this.serviceAreas.add(area);
        }
    }

    public Address getAddress() {
        return address;
    }

    public Menu getMenu() {
        return menu;
    }

    // Optional: Add null checks to setters if needed
    public void setName(String name) { // Added setter for name
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + getId() + '\'' + // Added id from Base
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", menu=" + menu +
                ", address=" + address +
                ", serviceAreas=" + serviceAreas +
                '}';
    }
}
