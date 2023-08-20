package Practice;

class DivideByZeroException extends Exception {
    DivideByZeroException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            if (denominator == 0) {
                throw new DivideByZeroException("Division by zero is not allowed.");
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            }
        catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
