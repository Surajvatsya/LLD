package exception;

public class LogoutFailedException extends Exception {

    public LogoutFailedException(String message) {
        super(message);
    }

    public LogoutFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
