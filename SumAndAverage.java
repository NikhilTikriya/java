import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // Add each element to the sum
        }

        double average = (double) sum / n;  // Calculate the average

        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);

        scanner.close();
    }
}
