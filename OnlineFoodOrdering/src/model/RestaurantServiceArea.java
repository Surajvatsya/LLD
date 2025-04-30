package model;

public class RestaurantServiceArea {
    private String restaurantId;
    private Address address;

    public RestaurantServiceArea(String restaurantId, Address address) {
        this.restaurantId = restaurantId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}
