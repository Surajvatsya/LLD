package model;

import java.math.BigDecimal; // Added import

public abstract class Payment extends Base {
    private PaymentStatus paymentStatus;
    private final String orderId; // Corrected name, made final
    private final BigDecimal amount; // Added payment amount, made final

    // Added amount parameter
    public Payment(String id, PaymentStatus paymentStatus, String orderId, BigDecimal amount) {
        super(id);
        this.paymentStatus = paymentStatus;
        this.orderId = orderId; // Corrected field name assignment
        this.amount = amount; // Initialize amount
    }

    // Added getter for paymentStatus
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    // Added setter for paymentStatus
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Added getter for orderId
    public String getOrderId() {
        return orderId;
    }

    // No setter for orderId as it's final

    // Added getter for amount
    public BigDecimal getAmount() {
        return amount;
    }

    // No setter for amount as it's final

    /**
     * Abstract method to be implemented by subclasses to return their specific payment type.
     * @return The PaymentType enum value.
     */
    public abstract PaymentType getPaymentType();
}
