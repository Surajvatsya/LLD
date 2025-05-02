package model;

import java.math.BigDecimal; // Added import

public class UPI extends Payment {
    private final String upiId; // Corrected field name convention, made final

    // Changed constructor to public, corrected parameter name convention
    // Added amount parameter to match superclass constructor
    public UPI(String id, PaymentStatus paymentStatus, String orderId, BigDecimal amount, String upiId) {
        super(id, paymentStatus, orderId, amount); // Pass amount to super
        this.upiId = upiId; // Corrected field assignment
    }

    // Added getter for upiId
    public String getUpiId() {
        return upiId;
    }

    // --- Implementation of abstract method ---

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.UPI;
    }
}
