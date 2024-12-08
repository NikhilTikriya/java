import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Before swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Swapping numbers using a temporary variable
        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        scanner.close();
    }
}
