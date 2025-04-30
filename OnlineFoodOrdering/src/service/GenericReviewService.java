package service;

import model.Review;

public interface GenericReviewService {
    void addreview(Review review);
    Review getReviewById(String restaurantid);
}
