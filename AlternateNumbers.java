import java.util.Scanner;

public class AlternateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < n; i += 2) {  // Skip every other element
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
