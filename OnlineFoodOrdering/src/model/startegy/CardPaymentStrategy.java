package model.strategy; // Corrected package name

import java.math.BigDecimal; // Import BigDecimal

public class CardPaymentStrategy implements PaymentStrategy { // Corrected interface name
    // Removed static final CARD_FEE to adhere better to OCP
    private final BigDecimal cardFee; // Instance field for injected fee

    /**
     * Constructor for CardPaymentStrategy.
     * @param cardFee The processing fee for card payments. Must not be null or negative.
     */
    public CardPaymentStrategy(BigDecimal cardFee) {
        if (cardFee == null || cardFee.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Card fee cannot be null or negative.");
        }
        this.cardFee = cardFee;
    }

    @Override
    public boolean pay(BigDecimal amount) { // Updated return type and signature
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            // Throw exception instead of printing to System.err
            throw new IllegalArgumentException("Invalid amount for card payment: " + amount);
        }
        // Use the injected instance fee
        BigDecimal totalAmount = amount.add(this.cardFee);

        // --- Placeholder for actual payment gateway interaction ---
        System.out.println("Processing card payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Card Fee: " + this.cardFee); // Use instance fee
        System.out.println("Total Amount Charged (Card): " + totalAmount);
        boolean paymentSuccess = simulateGatewayCall(totalAmount); // Simulate call
        // --- End Placeholder ---

        if (paymentSuccess) {
            System.out.println("Card payment successful.");
            return true;
        } else {
            System.err.println("Card payment failed.");
            // Consider throwing a specific PaymentProcessingException here
            return false;
        }
    }

    // Dummy method to simulate gateway interaction
    private boolean simulateGatewayCall(BigDecimal amountToCharge) {
        // In reality, interact with Stripe, PayPal, etc.
        // Handle potential exceptions from the gateway here.
        System.out.println("Simulating payment gateway call for amount: " + amountToCharge);
        // Simulate success/failure (e.g., based on amount or randomly)
        return amountToCharge.compareTo(new BigDecimal("1000")) < 0; // Example: fail if amount >= 1000
    }
}
