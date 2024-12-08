import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double convertedTemp;
        if (choice == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            convertedTemp = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + convertedTemp);
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            convertedTemp = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + convertedTemp);
        } else {
            System.out.println("Invalid choice! Please run the program again and choose 1 or 2.");
        }

        scanner.close();
    }
}

