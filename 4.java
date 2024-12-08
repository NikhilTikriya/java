class MyClass {
    int number;
    String text;

    // Constructor with no parameters
    MyClass() {
        number = 0;
        text = "Default";
    }

    // Constructor with one parameter
    MyClass(int num) {
        number = num;
        text = "Default";
    }

    // Constructor with two parameters
    MyClass(int num, String str) {
        number = num;
        text = str;
    }

    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        // Creating objects with different constructors
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
        MyClass obj3 = new MyClass(20, "Hello, Java!");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
