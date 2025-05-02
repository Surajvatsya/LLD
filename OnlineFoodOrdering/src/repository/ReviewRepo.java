package repository;

import model.Review;

import java.util.HashMap;
import java.util.List;

public class ReviewRepo implements GenericReview{

    private HashMap<String, Review> reviewHashMap = new HashMap<>();
    @Override
    public void addReview(Review review) { // Renamed method
        reviewHashMap.put(review.getId(),review);
    }

    @Override
    public List<Review>  getReviewById(String restaurantid) {
      return reviewHashMap.get(restaurantid);
    }
}
