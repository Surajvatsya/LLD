package service;

import model.Review;
import repository.GenericReview;

public class ReviewService implements GenericReviewService{ // Renamed class

    GenericReview reviewRepo;
    @Override
    public void addReview(Review review) { // Renamed method definition
        reviewRepo.addReview(review); // Renamed method call
    }

    @Override
    public Review getReviewById(String restaurantid) {
        return reviewRepo.getReviewById(restaurantid);
    }
}
