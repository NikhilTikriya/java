// Custom exception class to handle multiple Arithmetic exceptions
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ArithmeticExceptionHandler {

    public static void main(String[] args) {
        try {
            // Example calculation that could throw ArithmeticException
            int result = calculateExpression(10, 0); // This will throw ArithmeticException (divide by zero)
            System.out.println("Result: " + result);

            // Another example calculation that might cause ArithmeticException (overflow or invalid math)
            int overflowResult = calculateExpression(1000000, 0); // Might cause overflow (just for example)
            System.out.println("Overflow Result: " + overflowResult);
        } catch (CustomArithmeticException e) {
            // Handle the custom exception
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        }
    }

    // Method to calculate some mathematical expression
    public static int calculateExpression(int num1, int num2) throws CustomArithmeticException {
        try {
            // Trying to divide by zero (ArithmeticException)
            int result = num1 / num2;
            return result;
        } catch (ArithmeticException e) {
            // Catch division by zero error and throw custom exception
            throw new CustomArithmeticException("Cannot divide by zero. Arithmetic exception occurred!");
        }
    }
}
