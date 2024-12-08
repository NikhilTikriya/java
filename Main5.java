// 18. Java program with multiple interfaces and inheritance

// First interface with two methods
interface Interface1 {
    void method1();
    void method2();
}

// Second interface with two methods
interface Interface2 {
    void method3();
    void method4();
}

// Third interface with two methods
interface Interface3 {
    void method5();
    void method6();
}

// New interface inheriting from the three interfaces and adding a new method
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

// Concrete class to be inherited by a class that implements the CombinedInterface
class ConcreteClass {
    void displayMessage() {
        System.out.println("ConcreteClass display message");
    }
}

// Class that implements the new interface and inherits from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface1");
    }

    public void method3() {
        System.out.println("Method 3 from Interface2");
    }

    public void method4() {
        System.out.println("Method 4 from Interface2");
    }

    public void method5() {
        System.out.println("Method 5 from Interface3");
    }

    public void method6() {
        System.out.println("Method 6 from Interface3");
    }

    public void method7() {
        System.out.println("Method 7 from CombinedInterface");
    }
}

// Methods to take interfaces as arguments
class InterfaceMethods {
    void callInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    void callInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    void callInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    void callCombinedInterface(CombinedInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }
}

public class Main5 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        InterfaceMethods interfaceMethods = new InterfaceMethods();

        // Call methods passing the object to different interfaces
        interfaceMethods.callInterface1(myObject);
        System.out.println();

        interfaceMethods.callInterface2(myObject);
        System.out.println();

        interfaceMethods.callInterface3(myObject);
        System.out.println();

        interfaceMethods.callCombinedInterface(myObject);
        myObject.displayMessage();  // Display message from ConcreteClass
    }
}
