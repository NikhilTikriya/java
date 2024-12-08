// Define the custom exception for invalid username and password mismatch
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserAuthentication {

    // Function to check username and password
    public static void authenticate(String username, String password, String confirmPassword) throws InvalidUsernameException, PasswordMismatchException {
        // Check if username length is less than 6 characters
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }
        
        // Check if password and confirm password match
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Password and confirm password do not match.");
        }

        System.out.println("Authentication Successful!");
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take user input for username, password, and confirm password
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = sc.nextLine();

        try {
            // Call authenticate function to validate username and password
            authenticate(username, password, confirmPassword);
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            // Print the exception message
            System.out.println(e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
        }
    }
}
