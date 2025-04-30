package repository;

import model.Review;

import java.util.HashMap;

public class ReviewRepo implements GenericReview{

    private HashMap<String, Review> reviewHashMap = new HashMap<>();
    @Override
    public void addreview(Review review) {
        reviewHashMap.put(review.getId(),review);
    }

    @Override
    public Review getReviewById(String restaurantid) {
      return reviewHashMap.get(restaurantid);
    }
}
