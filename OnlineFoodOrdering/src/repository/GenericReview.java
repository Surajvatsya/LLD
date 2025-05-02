package repository;

import model.Review;

import java.util.List; // Assuming Option B might be chosen later

public interface GenericReview {
    void addReview(Review review); // Renamed method
    List<Review> getReviewById(String restaurantid); // Kept as is for now
}
