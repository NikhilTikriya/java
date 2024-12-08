class Parent {
    // Static method in the parent class
    static void display() {
        System.out.println("Parent class static method");
    }
}

class Child extends Parent {
    // Static method in the child class with the same name
    static void display() {
        System.out.println("Child class static method");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        // Calling the static method using parent class reference
        Parent.display();  // Calls the static method from Parent class

        // Calling the static method using child class reference
        Child.display();  // Calls the static method from Child class

        // Polymorphic behavior doesn't work with static methods.
    }
}
