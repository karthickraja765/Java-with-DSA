package OOP6.ExceptionHandling;

public class CustomException extends Exception { // This custom exception extends the inbuilt Exception
    public CustomException(String message) {
        super(message);
    }
}