class Num {
    int number;

    // Constructor to initialize the number
    Num(int number) {
        this.number = number;
    }

    // Method to display the number
    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    // Constructor to initialize the number
    HexNum(int number) {
        super(number);
    }

    // Overriding the shownum() method to display hexadecimal and octal values
    @Override
    void shownum() {
        System.out.println("Hexadecimal value: " + Integer.toHexString(number));
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating an object of Num class
        Num num = new Num(255);
        num.shownum();

        // Creating an object of HexNum class
        HexNum hexNum = new HexNum(255);
        hexNum.shownum();
    }
}
