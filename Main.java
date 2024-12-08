import java.util.Scanner;

// Base class ThreeDObject
class ThreeDObject {
    // Method to calculate the surface area (to be overridden)
    double wholeSurfaceArea() {
        return 0.0;
    }

    // Method to calculate the volume (to be overridden)
    double volume() {
        return 0.0;
    }
}

// Class Box derived from ThreeDObject
class Box extends ThreeDObject {
    double length, width, height;

    // Constructor to initialize dimensions of the Box
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Overriding the method to calculate surface area of the Box
    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Overriding the method to calculate volume of the Box
    @Override
    double volume() {
        return length * width * height;
    }
}

// Class Cube derived from Box (inherits Box)
class Cube extends Box {

    // Constructor to initialize dimensions of the Cube
    Cube(double side) {
        super(side, side, side);  // Cube has equal side lengths
    }

    // Overriding the method to calculate surface area of the Cube
    @Override
    double wholeSurfaceArea() {
        return 6 * (length * length);
    }

    // Overriding the method to calculate volume of the Cube
    @Override
    double volume() {
        return length * length * length;
    }
}

// Class Cylinder derived from ThreeDObject
class Cylinder extends ThreeDObject {
    double radius, height;

    // Constructor to initialize dimensions of the Cylinder
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding the method to calculate surface area of the Cylinder
    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Overriding the method to calculate volume of the Cylinder
    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Class Cone derived from ThreeDObject
class Cone extends ThreeDObject {
    double radius, height;

    // Constructor to initialize dimensions of the Cone
    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding the method to calculate surface area of the Cone
    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Overriding the method to calculate volume of the Cone
    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box input and calculations
        System.out.print("Enter the dimensions of the Box (length, width, height): ");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube input and calculations
        System.out.print("\nEnter the side length of the Cube: ");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder input and calculations
        System.out.print("\nEnter the radius and height of the Cylinder: ");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone input and calculations
        System.out.print("\nEnter the radius and height of the Cone: ");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
