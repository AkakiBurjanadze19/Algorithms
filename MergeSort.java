public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {30, 20, 15, 50, 34, 12, 5, 3, 1};
        
        System.out.println("unsorted array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("sorted array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // base case: if the left index is less than or equal to the right index, return
        if (left < right) {
            // find the middle point of the array
            int mid = left + (right - left) / 2;

            // recursively sort the left half of the array
            mergeSort(arr, left, mid);

            // recursively sort the right half of the array
            mergeSort(arr, mid + 1, right);

            // merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // find the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temporary arrays to hold the left and right subarrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // copy data into the temporary left and right subarrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // indices for the left, right and merged subarrays
        int i = 0;
        int j = 0;
        int k = left;

        // merge the two subarrays back into the original array
        while (i < n1 && j < n2) {
            // if the element in left subarray is smaller, place it into the original array
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                // otherwise, place the element from the right subarray
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // if any elements are left in the left subarray, copy them
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // if any elements are left in the right subarray, copy them
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}