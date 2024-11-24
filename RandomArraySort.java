import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        // Initialize an array with 10 random numbers
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Random numbers between 0 and 99
        }

        // Print the unsorted array
        System.out.println("Unsorted array: ");
        printArray(array);

        // Sort the array using Bubble Sort
        bubbleSort(array);

        // Print the sorted array
        System.out.println("Sorted array: ");
        printArray(array);
    }

    // Function to print the array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
