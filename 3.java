class MyClass {
    int number;
    String text;

    // Parameterized constructor
    MyClass(int num, String str) {
        number = num;
        text = str;
    }

    void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        // Creating an object with parameters
        MyClass obj = new MyClass(10, "Hello, Java!");
        obj.display();
    }
}
