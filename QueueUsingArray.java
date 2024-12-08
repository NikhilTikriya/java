import java.util.Scanner;

public class QueueUsingArray {
    static int max = 5; // Maximum size of the queue
    static int front = -1; // Front element index
    static int rear = -1; // Rear element index
    static int[] queue = new int[max]; // Array to store queue elements

    // Method to check if the queue is full
    static boolean isFull() {
        return rear == max - 1;
    }

    // Method to check if the queue is empty
    static boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Method to enqueue (add) an element to the queue
    static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            if (front == -1) {
                front = 0; // First element being added
            }
            queue[++rear] = value;
            System.out.println(value + " added to the queue.");
        }
    }

    // Method to dequeue (remove) an element from the queue
    static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " removed from the queue.");
            front++;
        }
    }

    // Method to display the front element of the queue
    static void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    // Method to display all the elements of the queue
    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the queue operations
        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
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
