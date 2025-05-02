package model.strategy; // Ensure package declaration is correct

import java.math.BigDecimal; // Import BigDecimal

public class UPIStrategy implements PaymentStrategy { // Corrected class and interface names
    @Override
    public boolean pay(BigDecimal amount) { // Updated return type and signature
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) { // UPI amount should be positive
            // Throw exception instead of printing to System.err
            throw new IllegalArgumentException("Invalid amount for UPI payment: " + amount);
        }

        // --- Placeholder for actual UPI payment interaction ---
        System.out.println("Processing UPI payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Total Amount Charged (UPI): " + amount); // Assuming no fee for UPI
        boolean paymentSuccess = simulateGatewayCall(amount); // Simulate call
        // --- End Placeholder ---

        if (paymentSuccess) {
            System.out.println("UPI payment successful.");
            return true;
        } else {
            System.err.println("UPI payment failed.");
            // Consider throwing a specific PaymentProcessingException here
            return false;
        }
    }

    // Dummy method to simulate gateway interaction
    private boolean simulateGatewayCall(BigDecimal amountToCharge) {
        // In reality, interact with UPI gateway/app
        // Handle potential exceptions here.
        System.out.println("Simulating UPI gateway call for amount: " + amountToCharge);
        // Simulate success/failure
        return true; // Example: Assume UPI always succeeds for now
    }
}
