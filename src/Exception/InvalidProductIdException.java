package Exception;

public class InvalidProductIdException extends Exception {
    public InvalidProductIdException() {
        super();
    }
    public InvalidProductIdException(String message) {
        super(message);
    }
    public InvalidProductIdException(String message, Throwable cause) {
        super(message, cause);
    }
}

