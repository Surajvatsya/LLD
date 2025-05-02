package service;

import model.Review;
import java.util.List; // Add missing import

public interface GenericReviewService {
    void addReview(Review review); // Renamed method
    // Renamed method for clarity
    List<Review> getReviewsByRestaurantId(String restaurantid);
}
