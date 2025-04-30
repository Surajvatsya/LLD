package model;

public class Payment extends Base{

    private PaymentStatus paymentStatus;
    private double totalfare;
    private String rideId;


    public Payment(String id, PaymentStatus paymentStatus, double totalfare, String rideId) {
        super(id);
        this.paymentStatus = paymentStatus;
        this.totalfare = totalfare;
        this.rideId = rideId;
    }


    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getTotalfare() {
        return totalfare;
    }
}
