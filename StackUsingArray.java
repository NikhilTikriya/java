import java.util.Scanner;

public class StackUsingArray {
    static int max = 5; // Maximum size of the stack
    static int top = -1; // Top element index
    static int[] stack = new int[max]; // Array to store stack elements

    // Method to check if the stack is full
    static boolean isFull() {
        return top == max - 1;
    }

    // Method to check if the stack is empty
    static boolean isEmpty() {
        return top == -1;
    }

    // Method to push an element onto the stack
    static void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Method to pop an element from the stack
    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }

    // Method to display the top element of the stack
    static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    // Method to display the elements of the stack
    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the stack operations
        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
