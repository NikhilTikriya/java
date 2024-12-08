// Define the custom exception for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonAgeValidation {

    // Function to check if the age is valid
    public static void checkAge(int age) throws NegativeAgeException {
        // If age is negative, throw a custom exception
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        System.out.println("Valid age entered.");
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take user input for name and age
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            // Call checkAge function to validate the age
            checkAge(age);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            // Catch the custom exception and print the error message
            System.out.println(e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
        }
    }
}
