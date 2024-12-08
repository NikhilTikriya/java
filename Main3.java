class Distance {
    double miles;

    // Constructor to initialize distance in miles
    Distance(double miles) {
        this.miles = miles;
    }

    // Method to calculate and print travel time assuming speed is 60 miles per hour
    void travelTime() {
        double time = miles / 60;  // Time = Distance / Speed
        System.out.println("Time taken to cover " + miles + " miles at 60 mph: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    
    // Constructor to initialize distance in miles
    DistanceMKS(double miles) {
        super(miles);
    }

    // Overriding travelTime() method to calculate time assuming speed is 100 km per second
    @Override
    void travelTime() {
        double kilometers = miles * 1.60934;  // Convert miles to kilometers
        double timeInSeconds = kilometers / 100;  // Time = Distance / Speed
        System.out.println("Time taken to cover " + kilometers + " kilometers at 100 km/s: " + timeInSeconds + " seconds");
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Creating an object of Distance class
        Distance distance = new Distance(120);
        distance.travelTime();

        // Creating an object of DistanceMKS class
        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();
    }
}
