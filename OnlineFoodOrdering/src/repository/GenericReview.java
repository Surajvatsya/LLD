package repository;

import model.Review;

public interface GenericReview {
    void addreview(Review review);
    Review getReviewById(String restaurantid);
}
