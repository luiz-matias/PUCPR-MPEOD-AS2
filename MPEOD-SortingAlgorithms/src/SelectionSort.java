public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        if (array.length == 1) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int copyIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) { //if minimum value is higher than any other value, then it becomes the smaller value found
                    min = array[j];
                    copyIndex = j; //copy the swapped value index
                }
            }

            int temp = array[i];
            array[i] = min; //put the smaller value always in the start
            array[copyIndex] = temp; //swap the old value with the new index copied
        }
    }

}
