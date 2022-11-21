public class Main {

    public static void main(String[] args) {
        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm selectionSort = new SelectionSort();

        int[] array = {3, 6, 8, 1, 4, 9, 0};
        printArray(array);
        bubbleSort.sort(array);
        printArray(array);

        int[] array2 = {3, 6, 8, 1, 4, 9, 0};
        printArray(array2);
        selectionSort.sort(array2);
        printArray(array2);
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