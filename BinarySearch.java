public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 30, 40, 50, 60};

        System.out.println("array in which we are searching: ");
        printArray(arr);

        int target = 30;
        System.out.println("Element we are looking for: " + target);

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element was found at index: " + result);
        } else {
            System.out.println("Element was not found in the array");
        }
    }

    public static int binarySearch(int[] array, int target) {
        // left boundary of the search engine
        int low = 0;
        // right boundary of the search engine
        int high = array.length - 1;

        // continue search while the range is valid
        while (low <= high) {
            // calculate the middle index
            int mid = low + (high - low) / 2;
            // check if the middle element is the target
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                // if the target is smaller, search the left half
                high = mid - 1;
            } else {
                // if the target is larger, search the right half
                low = mid + 1;
            }
        }

        // return -1 if the target element is not found
        return -1;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}