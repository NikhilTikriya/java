public class ParameterizedConstructor {

    // Instance variables
    private String name;
    private int age;

    // Parameterized constructor
    public ParameterizedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object and pass parameters to the constructor
        ParameterizedConstructor obj = new ParameterizedConstructor("Alice", 25);
        obj.display(); // Display the values
    }
}
