package model;

public class CreditCard extends Payment{

    private String cardOwner;

    protected CreditCard(String id, PaymentStatus paymentStatus, String orderId,String cardOwner) {
        super(id, paymentStatus, orderId);
        this.cardOwner = cardOwner;
    }
}
