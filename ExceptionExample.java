public class ExceptionExample {

    public static void main(String[] args) {
        // Example of NegativeArraySizeException
        try {
            System.out.println("Trying to access an invalid array index");
            int[] arr = new int[5];
            // Attempt to access a negative index
            System.out.println(arr[-1]); // This will throw NegativeArraySizeException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }

        // Example of ArithmeticException
        try {
            System.out.println("Trying to perform division by zero");
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }
    }
}
