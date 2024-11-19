public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {25, 23, 10, 30, 15, 3, 5, 2, 1};

        System.out.println("unsorted array: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("sorted array: ");
        printArray(arr);
    }

    public static void bubbleSort(int[] array) {
        // get the size of the array
        int n = array.length;

        // iterate through the array multiple times
        for (int i = 0; i < n - 1; i++) {
            // compare adjacent elements and swap if needed
            for (int j = 0; j < n - 1 - i; j++) {
                // compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // swap if the element at j is greater than the element at j + 1
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
