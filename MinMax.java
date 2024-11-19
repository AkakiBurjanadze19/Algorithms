public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("array where we find minimum and maximum numbers:");
        printArray(arr);

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public static int findMin(int[] array) {
        // initialize minimum number as the first element of the array
        int min = array[0];

        // iterate through the array
        for (int i = 0; i < array.length; i++) {
            // if the current number is less than the minimum number
            if (array[i] < min) {
                // update minimum number to be the current minimum number
                min = array[i];
            }
        }

        // return the minimum number
        return min;
    }

    public static int findMax(int[] array) {
        // initialize maximum number as the first element of the array
        int max = array[0];

        // iterate through the array
        for (int i = 0; i < array.length; i++) {
            // if the current number is greater than the maximum number
            if (array[i] > max) {
                // update maximum number to be the current maximum number
                max = array[i];
            }
        }

        // return the maximum number
        return max;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}