public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("original array: ");
        printArray(arr);

        reverseArray(arr);

        System.out.println("reversed array: ");
        printArray(arr);
    }

    public static void reverseArray(int[] array) {
        // pointer for the beginning of the array
        int start = 0;
        // pointer for the end of the array
        int end = array.length - 1;

        // until start pointer is less than end pointer perform the swap
        while (start < end) {
            // swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // move pointers toward the center
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}