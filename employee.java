import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    // Constructor to initialize employee details
    Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    // Method to calculate and display gross salary
    void displayGrossSalary() {
        double hra = basic_salary * 0.10; // HRA is 10% of basic salary
        double da = basic_salary * 0.05;  // DA is 5% of basic salary
        double gross_salary = basic_salary + hra + da;
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // To consume the newline character
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        
        Employee emp = new Employee(id, name, salary);
        emp.displayGrossSalary();
    }
}