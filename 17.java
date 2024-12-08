import java.util.Scanner;

class SumConsecutiveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        String numStr = Integer.toString(number);

        // Forming numbers from consecutive digits and calculating sum
        for (int i = 0; i < numStr.length() - 1; i++) {
            int num1 = Integer.parseInt(numStr.substring(i, i + 2));
            sum += num1;
        }

        System.out.println("Sum of consecutive numbers: " + sum);
    }
}