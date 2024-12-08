class MyClass {

    // Method with one parameter
    void display(int num) {
        System.out.println("Number: " + num);
    }

    // Method with two parameters
    void display(int num, String text) {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    // Method with a different parameter type
    void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling the overloaded methods
        obj.display(10);
        obj.display(20, "Hello");
        obj.display("Java Programming");
    }
}
