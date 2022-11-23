import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm selectionSort = new SelectionSort();

        int[] array1 = {3, 6, 8, 1, 4, 9, 0};
        int[] array2 = {0, 0, 3, 5, 7, 81, -4, -99, 13, 1};
        int[] array3 = {2, 14, 8, 5, 1, 2, 0, 33, 7, -1};

        System.out.println("---------- BUBBLE SORT | Time complexity: O(n^2) ----------");
        System.out.println("Non-ordered array:");
        printArray(array1);
        bubbleSort.sort(array1);
        System.out.println("Ordered array:");
        printArray(array1);

        System.out.println("Non-ordered array:");
        printArray(array2);
        bubbleSort.sort(array2);
        System.out.println("Ordered array:");
        printArray(array2);

        System.out.println("Non-ordered array:");
        printArray(array3);
        bubbleSort.sort(array3);
        System.out.println("Ordered array:");
        printArray(array3);

        System.out.println("---------- END OF BUBBLE SORT ----------\n\n");

        array1 = new int[]{3, 6, 8, 1, 4, 9, 0};
        array2 = new int[]{0, 0, 3, 5, 7, 81, -4, -99, 13, 1};
        array3 = new int[]{2, 14, 8, 5, 1, 2, 0, 33, 7, -1};

        System.out.println("---------- SELECTION SORT | Time complexity: O(n^2) ----------");
        System.out.println("Non-ordered array:");
        printArray(array1);
        selectionSort.sort(array1);
        System.out.println("Ordered array:");
        printArray(array1);

        System.out.println("Non-ordered array:");
        printArray(array2);
        selectionSort.sort(array2);
        System.out.println("Ordered array:");
        printArray(array2);

        System.out.println("Non-ordered array:");
        printArray(array3);
        selectionSort.sort(array3);
        System.out.println("Ordered array:");
        printArray(array3);

        System.out.println("---------- END OF SELECTION SORT ----------");

    }

    /**
     * Print an array through the console
     *
     * @param array array to be printed
     */
    static void printArray(int[] array) {
        StringBuilder arrayString = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            arrayString.append(array[i]);

            if (i != array.length - 1) {
                arrayString.append(", ");
            }
        }
        arrayString.append("]");

        System.out.println(arrayString);
    }

}