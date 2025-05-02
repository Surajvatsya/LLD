package model;

import java.math.BigDecimal; // Added import

import java.math.BigDecimal; // Added import

public class CreditCard extends Payment {

    private final String cardOwner; // Made final
    // TODO: Add other relevant fields like lastFourDigits, cardType, expiryMonth, expiryYear. NEVER store full card number or CVV.

    // Changed constructor to public for factory instantiation
    // Added amount parameter to match superclass constructor
    public CreditCard(String id, PaymentStatus paymentStatus, String orderId, BigDecimal amount, String cardOwner) {
        super(id, paymentStatus, orderId, amount); // Pass amount to super
        this.cardOwner = cardOwner;
    }

    // Added getter for cardOwner
    public String getCardOwner() {
        return cardOwner;
    }

    // --- Implementation of abstract method ---

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CREDIT_CARD;
    }
}
