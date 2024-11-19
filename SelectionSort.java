public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("original array to be sorted: ");
        printArray(array);

        selectionSort(array);

        System.out.println("sorted array: ");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        // get the size of the array
        int n = array.length;

        // iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // assume the first element of the unsorted part as the minimum
            int minIndex = i;

            // find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                // compare current element with the current minimum
                if (array[j] < array[minIndex]) {
                    // update the index of the minimum element
                    minIndex = j;
                }
            }

            // swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}