package model;

import java.math.BigDecimal; // Added import

// Removed unused import java.util.Objects;

public class PaymentFactory {

    /**
     * Creates a Payment object based on the specified type.
     *
     * @param type          The type of payment method (CREDIT_CARD or UPI).
     * @param id            The unique ID for this payment transaction.
      * @param orderId       The ID of the order associated with this payment.
      * @param amount        The amount for this payment transaction.
      * @param cardOwnerName The name of the card owner (only used for CREDIT_CARD).
      * @param upiId         The UPI ID (only used for UPI).
      * @return The created Payment object.
      * @throws IllegalArgumentException if the payment type is unsupported or required parameters are missing.
      */
    // Added amount parameter
    public static Payment createPaymentMethod(PaymentType type, String id, String orderId, BigDecimal amount, String cardOwnerName, String upiId) {
        if (type == null) {
            throw new IllegalArgumentException("Payment type cannot be null.");
        }
        // Added validation for amount
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
             throw new IllegalArgumentException("Payment amount must be positive.");
        }
        // Basic validation for common parameters
        if (id == null || orderId == null) {
             throw new IllegalArgumentException("Payment ID and Order ID cannot be null.");
        }

        switch (type) {
            case CREDIT_CARD:
                 if (cardOwnerName == null) {
                     throw new IllegalArgumentException("Card owner name is required for credit card payments.");
                 }
                 // Pass amount to CreditCard constructor
                return new CreditCard(id, PaymentStatus.PENDING, orderId, amount, cardOwnerName);
            case UPI:
                 if (upiId == null) {
                     throw new IllegalArgumentException("UPI ID is required for UPI payments.");
                 }
                 // Pass amount to UPI constructor
                return new UPI(id, PaymentStatus.PENDING, orderId, amount, upiId);
            default:
                // This case should ideally not be reached if all enum values are handled
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
