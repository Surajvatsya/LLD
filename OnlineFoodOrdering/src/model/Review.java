package model;

public class Review {
    private double rating;
    private String review;
    private String userId;
    private String restaurantid;
    private String id;

    public Review(double rating, String review, String restaurantid, String userId, String id) {
        this.rating = rating;
        this.review = review;
        this.restaurantid = restaurantid;
        this.userId = userId;
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
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

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(String restaurantid) {
        this.restaurantid = restaurantid;
    }
}
