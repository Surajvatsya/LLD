package model;

public class UPI extends Payment{
    private String upiid;
    protected UPI(String id, PaymentStatus paymentStatus, String orderId, String upiid) {
        super(id, paymentStatus, orderId);
        this.upiid = upiid;
    }
}
