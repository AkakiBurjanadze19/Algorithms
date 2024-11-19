public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 15, 5, 20, 30};
        int target = 20;

        System.out.println("array in which we are searching: ");
        printArray(arr);
        System.out.println("Element we are looking for: " + target);

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element was found at index: " + result);
        } else {
            System.out.println("Element was not found.");
        }
    }

    public static int linearSearch(int[] array, int target) {
        // iterate through the array from the first element to the last
        for (int i = 0; i < array.length; i++) {
            // check if the current element matches the target
            if (array[i] == target) {
                // return the index if the target is found
                return i;
            }
        }

        // return -1 if the target is not found in the array
        return -1;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}