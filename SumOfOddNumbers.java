import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sum of odd numbers
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("The sum of all odd numbers is: " + sum);

        scanner.close();
    }
}
