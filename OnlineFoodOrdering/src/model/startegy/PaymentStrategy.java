package model.strategy; // Corrected package name typo

import java.math.BigDecimal; // Import BigDecimal

public interface PaymentStrategy { // Corrected interface name
    /**
     * Processes the payment for the given amount.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     * @throws IllegalArgumentException if the amount is invalid.
     * @throws PaymentProcessingException for errors during payment gateway interaction (Consider adding this custom exception).
     */
    boolean pay(BigDecimal amount); // Changed return type to boolean
}
