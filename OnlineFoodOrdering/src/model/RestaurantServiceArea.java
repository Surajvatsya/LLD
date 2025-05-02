package model;

// Represents an area (defined by Address) served by a specific restaurant.
public class RestaurantServiceArea {
    // TODO: Consider if this should extend Base if it needs its own ID, createdAt etc.
    private final String restaurantId; // Made final
    private final Address address; // Made final - Represents the service area location/boundary

    public RestaurantServiceArea(String restaurantId, Address address) {
        // Add null checks if necessary
        this.restaurantId = restaurantId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // Removed setAddress as address is final

    public String getRestaurantId() {
        return restaurantId;
    }

    // Removed setRestaurantId as restaurantId is final
}
