package model;

import java.util.ArrayList; // Added import
import java.util.List; // Added import

public class Restaurant extends Base {
    private String name;
    private Address address;
    private Menu menu;
    // TODO: How is avgRating calculated and updated? Consider deriving from Reviews or using an update mechanism in the service layer.
    private double avgRating;
    private boolean isOpen;
    // Added list to hold reviews associated with this restaurant
    private final List<Review> reviews; // Made final, initialized below
    // TODO: Add relationship to ServiceArea (e.g., RestaurantServiceArea serviceArea or List<String> serviceablePincodes).-- don't keep it

    public Restaurant(String id, String name, Address address, Menu menu) {
        super(id);
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.isOpen = true; // Consider if this should be configurable
        this.avgRating = 0.0; // Initialize avgRating
        this.reviews = new ArrayList<>(); // Initialize review list
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    // Removed redundant getId() method; it's inherited from Base class.

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
        // TODO: Consider if this should be set manually or calculated automatically when reviews change.
        this.avgRating = avgRating;
    }

    // --- Review Management ---

    /**
     * Returns an unmodifiable view of the reviews for this restaurant.
     * Prevents external code from modifying the list structure directly.
     * @return An unmodifiable List of Reviews.
     */
    public List<Review> getReviews() {
        // Requires: import java.util.Collections;
        // return Collections.unmodifiableList(reviews);
        // Returning direct reference for now, matching User.getOrderHistory approach
        // TODO: Revisit returning Collections.unmodifiableList(reviews) for better encapsulation.
        return reviews;
    }

    /**
     * Adds a review to this restaurant's list.
     * Note: This assumes the Review object is valid and belongs to this restaurant.
     * Consider adding validation or managing this relationship in a service layer.
     * Also, adding a review here should trigger an update to avgRating.
     * @param review The review to add.
     */
    public void addReview(Review review) {
        if (review != null) {
            this.reviews.add(review);
            // TODO: Add logic here or in a service to recalculate avgRating.
        }
    }
}
