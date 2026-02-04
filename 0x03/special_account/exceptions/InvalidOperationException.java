package exceptions;

// Custom exception for invalid operations in bank accounts
public class InvalidOperationException extends Exception {

    // Constructor that receives a message
    public InvalidOperationException(String message) {
        super(message);
    }
}
