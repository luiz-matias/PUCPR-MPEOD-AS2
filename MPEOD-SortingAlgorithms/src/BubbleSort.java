public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        recursiveBubbleSort(array, array.length);
    }

    static void recursiveBubbleSort(int[] array, int length) { //----> O(n^2)

        if (array.length == 1) { //if length equals 1, then return
            return;
        }

        int swaps = 0; //swap counter

        for (int i = 0; i < length - 1; i++) { //swap values when the next value is higher
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                swaps += 1;
            }
        }

        if (swaps == 0) { //if swap wasn't necessary, then return
            return;
        }

        recursiveBubbleSort(array, length - 1); //restart bubble sort process in a recursive way

    }

}