import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Example input arrays A and B
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        // Merge the arrays into a single sorted array
        int[] C = mergeSortedArrays(A, B);

        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(C));
    }

    // Function to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m]; // Array to store merged result

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // If there are remaining elements in A
        while (i < n) {
            C[k++] = A[i++];
        }

        // If there are remaining elements in B
        while (j < m) {
            C[k++] = B[j++];
        }

        return C;
    }
}
