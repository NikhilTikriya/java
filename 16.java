class StaticKeywordExample {
    static int counter = 0;

    // Constructor increments static counter variable
    StaticKeywordExample() {
        counter++;
    }

    // Static method to display the count
    static void displayCount() {
        System.out.println("Counter value: " + counter);
    }

    public static void main(String[] args) {
        new StaticKeywordExample();
        new StaticKeywordExample();
        StaticKeywordExample.displayCount();  // Static method call
    }
}