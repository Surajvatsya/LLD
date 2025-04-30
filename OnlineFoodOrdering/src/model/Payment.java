package model;

public abstract class Payment extends Base{
    private PaymentStatus paymentStatus;
    private String OrderId;

    public Payment(String id, PaymentStatus paymentStatus, String orderId) {
        super(id);
        this.paymentStatus = paymentStatus;
        OrderId = orderId;
    }
}
