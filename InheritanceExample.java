// Base class (Parent class)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child class) inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Dog dog = new Dog();
        dog.sound();  // Calling the overridden method

        // Creating an object of the base class
        Animal animal = new Animal();
        animal.sound();  // Calling the method in the base class
    }
}
