public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("array to be sorted: ");
        printArray(array);

        insertionSort(array);

        System.out.println("sorted array: ");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        // get the size of the array
        int n = array.length;

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // store the current element to be inserted in the sorted position
            int key = array[i];

            // index of the last element in the sorted portion
            int j = i - 1;

            // shift elements of the sorted portion to the right
            // if they are greater than the key
            while (j >= 0 && array[j] >= key) {
                // move the element one position to the right
                array[j + 1] = array[j];
                // move to the previous element
                j--;
            }

            // insert the key at the correct position
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}