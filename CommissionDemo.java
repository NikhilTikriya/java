import java.util.Scanner;

class Commission {
    // Instance variable to store the sales amount
    private double sales;

    // Constructor to initialize the sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission (assuming a 10% commission rate)
    public double commission() {
        return sales * 0.10; // 10% commission
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read sales value from user
        System.out.print("Enter the sales amount: ");
        double salesAmount = scanner.nextDouble();

        // Validate if the sales value is negative
        if (salesAmount < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object with the sales amount
            Commission commissionObj = new Commission(salesAmount);

            // Get and print the commission
            double commission = commissionObj.commission();
            System.out.println("The commission is: " + commission);
        }

        scanner.close();
    }
}
