/**
 * Custom exception class that extends Exception
 * This represents a user-defined exception for specific logic
 */
public class CustomException extends Exception {
    
    public CustomException() {
        super("A custom exception occurred");
    }
    
    public CustomException(String message) {
        super(message);
    }
    
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public CustomException(Throwable cause) {
        super(cause);
    }
}

