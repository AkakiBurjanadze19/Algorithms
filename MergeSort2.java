public class MergeSort2 {
    public static void main(String[] args) {
        int[] nums = {35, 25, 15, 23, 5, 16, 9};
        mergeSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] array) {
        // Base case: if array length is 1 or less, it's already sorted
        if (array.length <= 1) {
            return;
        }

        // Calculate the middle point
        int middle = array.length / 2;

        // Create left and right subarrays
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        // Copy elements to left and right subarrays
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < array.length; i++) {
            rightArray[i - middle] = array[i];
        }

        // Recursively sort both subarrays
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted subarrays
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; // index for the main array
        int l = 0; // index for left array
        int r = 0; // index for right array

        // Compare and merge elements from left and right arrays
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // Copy remaining elements from left array, if any
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // Copy remaining elements from right array, if any
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
