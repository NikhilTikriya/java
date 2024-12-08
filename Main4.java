// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Intermediate class inheriting from Animal
class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal sleeps");
    }
}

// Derived class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog();
        
        // Calling methods from all levels of inheritance
        dog.eat();   // From Animal class
        dog.sleep(); // From Mammal class
        dog.bark();  // From Dog class
    }
}
