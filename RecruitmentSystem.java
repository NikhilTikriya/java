// Define the custom exceptions
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class RecruitmentSystem {

    // Function to check eligibility
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder(name + " is too old for this position.");
        } else if (age < 20) {
            throw new TooYounger(name + " is too young for this position.");
        } else {
            System.out.println("Eligible: " + name);
        }
    }

    public static void main(String[] args) {
        // Create scanner to take input
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Take user input for name and age
        System.out.print("Enter the candidate's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the candidate's age: ");
        int age = sc.nextInt();
        
        try {
            // Call checkEligibility function
            checkEligibility(name, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close(); // Close scanner resource
        }
    }
}
