package service;

import model.Review;
import repository.GenericReview;

public class reviewService implements GenericReviewService{

    GenericReview reviewRepo;
    @Override
    public void addreview(Review review) {
        reviewRepo.addreview(review);
    }

    @Override
    public Review getReviewById(String restaurantid) {
        return reviewRepo.getReviewById(restaurantid);
    }
}
