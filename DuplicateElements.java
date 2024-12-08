import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            frequencyMap.put(numbers[i], frequencyMap.getOrDefault(numbers[i], 0) + 1);
        }

        // Display duplicate elements and their frequencies
        System.out.println("Duplicate elements and their frequencies:");
        boolean foundDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }
}
