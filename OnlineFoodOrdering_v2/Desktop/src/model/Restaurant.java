package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Base{


    private String name;
    private String mobile;
    private Menu menu; // question
    private Address address;
    private final List<Address> serviceAreas;
    //make rating n review class


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

    public List<Address> getServiceAreas() {
        return serviceAreas;
    }

    public Address getAddress() {
        return address;
    }

    public Menu getMenu() {
        return menu;
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
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", menu=" + menu +
                ", address=" + address +
                ", serviceAreas=" + serviceAreas +
                '}';
    }
}
