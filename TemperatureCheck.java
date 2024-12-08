// Custom exception for "TooHot" temperature
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

// Custom exception for "TooCold" temperature
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureCheck {

    public static void main(String[] args) {
        // Check if a temperature argument is passed
        if (args.length != 1) {
            System.out.println("Please provide the temperature in Celsius.");
            return;
        }

        try {
            // Parse the input temperature from command line argument
            double temperature = Double.parseDouble(args[0]);

            // Check if the temperature is too hot or too cold
            if (temperature > 35) {
                throw new TooHot("Temperature is too hot! Above 35°C.");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold! Below 5°C.");
            } else {
                // If temperature is in the normal range, print "Normal" and convert to Fahrenheit
                System.out.println("Normal");
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
            }

        } catch (TooHot e) {
            // Catch TooHot exception
            System.out.println(e.getMessage());
        } catch (TooCold e) {
            // Catch TooCold exception
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // Handle invalid input (not a number)
            System.out.println("Invalid input! Please provide a valid number for temperature.");
        }
    }
}
