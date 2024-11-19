public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("array to be rotated:");
        printArray(arr);
        
        rotateArray(arr, 2);

        System.out.println("rotated array: ");
        printArray(arr);
    }

    public static void rotateArray(int[] array, int k) {
        // get the size of the array
        int n = array.length;
        // handle cases where k >= n (only meaningful rotations)
        k = k % n;

        // reverse the entire array
        reverseArray(array, 0, n - 1);

        // reverse the first k elements
        reverseArray(array, 0, k - 1);

        // reverse the remaining n-k elements
        reverseArray(array, k, n - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

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
