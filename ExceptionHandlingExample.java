// 19. Java program to demonstrate the use of all exception handling keywords

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Try block to catch exceptions
            System.out.println("In try block");
            int result = 10 / 0;  // ArithmeticException will be thrown
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Caught ArithmeticException: " + e);
        } catch (Exception e) {
            // Catch block to handle other general exceptions
            System.out.println("Caught Exception: " + e);
        } finally {
            // Finally block that always executes
            System.out.println("Finally block executed");
        }

        // Demonstrating use of throw
        try {
            System.out.println("Throwing custom exception");
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            // Catching custom exception
            System.out.println("Caught CustomException: " + e.getMessage());
        }

        // Demonstrating use of throws
        try {
            System.out.println("Calling method with throws keyword");
            methodWithThrows();
        } catch (Exception e) {
            // Catch block to handle exception thrown by method
            System.out.println("Caught Exception from methodWithThrows: " + e);
        }
    }

    // Method that declares exception with 'throws'
    static void methodWithThrows() throws Exception {
        throw new Exception("Exception thrown from methodWithThrows");
    }
}

// Custom exception class to demonstrate throw keyword
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
