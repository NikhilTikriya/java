// Base class (Parent class)
class Animal {
    // Method in the base class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child class) overriding the sound method
class Dog extends Animal {
    // Overriding the method in the derived class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Dog dog = new Dog();
        dog.sound();  // Calling the overridden method

        // Creating an object of the base class
        Animal animal = new Animal();
        animal.sound();  // Calling the method in the base class
    }
}
