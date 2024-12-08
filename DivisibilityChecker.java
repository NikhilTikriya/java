import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the numbers
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Check divisibility
            if (dividend % divisor == 0) {
                System.out.println(dividend + " is divisible by " + divisor + ".");
            } else {
                System.out.println(dividend + " is not divisible by " + divisor + ".");
            }
        }

        scanner.close();
    }
}
