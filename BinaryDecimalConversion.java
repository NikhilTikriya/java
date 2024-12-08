import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Convert Binary to Decimal
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("Binary " + binary + " to Decimal: " + decimal);
                break;

            case 2:
                // Convert Decimal to Binary
                System.out.print("Enter a decimal number: ");
                int decimalNumber = scanner.nextInt();
                String binaryString = Integer.toBinaryString(decimalNumber);
                System.out.println("Decimal " + decimalNumber + " to Binary: " + binaryString);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
