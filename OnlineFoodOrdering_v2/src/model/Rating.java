package model;

import java.time.LocalDateTime;

public class Rating extends Base{

    private final String userId;
    private String review;
    private int rating;
    private final String restaurantId;

    public Rating(String id, LocalDateTime createdAt, String userId, String review, int rating, String restaurantId) {
        super(id, createdAt);
        this.userId = userId;
        this.review = review;
        this.rating = rating;
        this.restaurantId = restaurantId;
    }

    public String getUserId() {
        return userId;
    }

    public String getReview() {
        return review;
    }

    public int getRating() {
        return rating;
    }

    public String getRestaurantId() {
        return restaurantId;
    }
}
