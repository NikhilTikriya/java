class ThisKeywordExample {
    int num;

    // Constructor using 'this' keyword to differentiate between local and instance variables
    ThisKeywordExample(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample(100);
        obj.display();
    }
}