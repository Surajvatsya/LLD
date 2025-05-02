package model;

// Represents a user review for a restaurant.
public class Review extends Base { // Extend Base
    // TODO: Consider using int for rating if it's discrete (e.g., 1-5 stars).
    private double rating;
    private String review; // Review text
    private final String userId; // Made final
    // Removed restaurantId field - relationship managed from Restaurant class
    // id is inherited from Base

    /**
     * Constructor for Review.
     * @param id Unique ID for the review (from Base).
     * @param userId ID of the user who wrote the review.
     * @param rating The rating given (e.g., 1.0 to 5.0).
     * @param review The text content of the review.
     */
    // Removed restaurantId parameter
    public Review(String id, String userId, double rating, String review) {
        super(id); // Call Base constructor
        this.userId = userId;
        // Removed restaurantId assignment
        // TODO: Add validation for rating range (e.g., 1-5)
        this.rating = rating;
        this.review = review;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // TODO: Add validation for rating range (e.g., 1-5)
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getUserId() {
        return userId;
    }

    // Removed setUserId as userId is final

    // getId() is inherited from Base
    // Removed setId as id is inherited and final in Base

    // Removed getRestaurantId() method
}
