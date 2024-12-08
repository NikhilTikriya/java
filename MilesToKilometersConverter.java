import java.util.Scanner;

public class MilesToKilometersConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion factor: 1 mile = 1.60934 kilometers
        final double MILES_TO_KILOMETERS = 1.60934;

        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        // Convert miles to kilometers
        double kilometers = miles * MILES_TO_KILOMETERS;

        System.out.println("The distance in kilometers is: " + kilometers);

        scanner.close();
    }
}
