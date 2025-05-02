package exception;

public class RestaurantRegistrationException extends Exception {

    public RestaurantRegistrationException(String message) {
        super(message);
    }

    public RestaurantRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }
}
