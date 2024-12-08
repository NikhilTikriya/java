import java.util.HashMap;
import java.util.Map;

// Custom exception class
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {

    public static void main(String[] args) {
        // Create a map of countries and their capitals
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

        // Check if a country is entered as a command line argument
        if (args.length != 1) {
            System.out.println("Please provide exactly one country as an argument.");
            return;
        }

        String country = args[0];

        try {
            // Check if the capital for the entered country exists
            String capital = countryCapitals.get(country);

            if (capital == null) {
                // If the country is not found in the map, throw NoMatchFoundException
                throw new NoMatchFoundException("No match found for the country: " + country);
            }

            // If the country exists, print the capital
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            // Catch the custom exception and display the message
            System.out.println(e.getMessage());
        }
    }
}
