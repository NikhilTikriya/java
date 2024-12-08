class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor to initialize the vehicle
    Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to show general vehicle data
    void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    // Constructor to initialize the bus
    Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    // Overriding showData() method to display Bus details
    @Override
    void showData() {
        super.showData();
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    // Constructor to initialize the car
    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    // Overriding showData() method to display Car details
    @Override
    void showData() {
        super.showData();
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating an object of Bus
        Bus bus = new Bus("TN01AB1234", 80, "Yellow", "John Doe", "Route 45");
        bus.showData();

        // Creating an object of Car
        Car car = new Car("KA05CD5678", 120, "Red", "Jane Doe", "Toyota");
        car.showData();
    }
}
