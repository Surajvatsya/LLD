package model;

public class Feedback extends Base{
    private String message;
    private double rating;
    private String userId;
    private String driverid;

    public Feedback(String id, String message, double rating, String userId, String driverid) {
        super(id);
        this.message = message;
        this.rating = rating;
        this.userId = userId;
        this.driverid = driverid;
    }
}
