package model;

public class Booking extends Base{

    private String rideId;
    private String userId;
    private String paymentMethod;
    private String paymentId;

    public Booking(String id, String rideId, String userId, String paymentMethod, String paymentId) {
        super(id);
        this.rideId = rideId;
        this.userId = userId;
        this.paymentMethod = paymentMethod;
        this.paymentId = paymentId;
    }

    public String getRideId() {
        return rideId;
    }

    public String getUserId() {
        return userId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "rideId='" + rideId + '\'' +
                ", userId='" + userId + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentId='" + paymentId + '\'' +
                '}';
    }
}
