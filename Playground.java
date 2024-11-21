import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {
//      matrix1(5);
//        matrix2(5);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < array.length; i++) {
            rightArray[i - middle] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0;
        int l = 0;
        int r = 0;

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

        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int iterativeBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == array[mid]) {
            return mid;
        } else if (target < array[mid]) {
            return recursiveBinarySearch(array, target, start, end - 1);
        } else {
            return recursiveBinarySearch(array, target, start + 1, end);
        }
    }

    public static int fibonacci(int n) {
        // f(n) = f(n - 1) + f(n - 2)
        if (n < 0) {
            System.out.println("number must be greater than 0");
            return -1;
        }

        int first = 0;
        int second = 1;

        for (int i = 0; i < n - 1; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            System.out.println("invalid");
            return new int[][]{};
        }

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                resultMatrix[i][j] = 0;

                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static boolean isPalindrome1(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindrome2(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr.equals(str);
    }

    public static String reverseString1(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }

    public static String reverseString2(String str) {
        char[] array = str.toCharArray();

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        return new String(array);
    }

    public static boolean containsSubstring(String string, String pattern) {
        int stringLength = string.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= stringLength - patternLength; i++) {
            boolean isFound = true;

            for (int j = 0; j < patternLength; j++) {
                if (string.charAt(i + j) != pattern.charAt(j)) {
                    isFound = false;
                }
            }

            if (isFound) {
                return true;
            }
        }

        return false;
    }

    public static boolean areAnagrams1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        for (int i = 0; i < str1Lower.length(); i++) {
            char c = str1Lower.charAt(i);
            int index = c - 'a';
            charCount1[index]++;
        }

        for (int i = 0; i < str2Lower.length(); i++) {
            char c = str2Lower.charAt(i);
            int index = c - 'a';
            charCount2[index]++;
        }

        for (int i = 0; i < charCount1.length; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean areAnagrams2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static String removeVowels(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isVowel(c)) {
                result += c;
            }
        }

        return result;
    }

    public static boolean isVowel(char c) {
        char lowerChar = Character.toLowerCase(c);

        if (lowerChar == 'a'
        || lowerChar == 'e'
        || lowerChar == 'i'
        || lowerChar == 'o'
        || lowerChar == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static int countWords(String str) {
        str = str.trim();

        if (str == null || str.isEmpty()) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                inWord = false;
            } else if (!inWord) {
                wordCount++;
                inWord = true;
            }
        }

        return wordCount;
    }

    public static int[] countCharFrequency(String str) {
        if (str == null || str.isEmpty()) {
            return new int[]{};
        }

        int[] charCount = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            charCount[index]++;
        }

        return charCount;
    }

    public static String toLower(String str) {
        return str.toLowerCase();
    }

    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    public static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        boolean[] seen = new boolean[26];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            if (!seen[index]) {
                result += c;
                seen[index] = true;
            }
        }

        return result;
    }

    public static String removeWhitespaces(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            }
            result += c;
        }

        return result;
    }

    public static String replaceChar(String str, char oldChar, char newChar) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == oldChar) {
                result += newChar;
            } else {
                result += c;
            }
        }

        return result;
    }

    public static int calcHammingDistance(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("invalid sizes");
            return -1;
        }

        int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 != c2) {
                distance++;
            }
        }

        return distance;
    }

    public static boolean isStringSorted(String str) {
        if (str.isEmpty()) {
            return true;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);

            if (currentChar > nextChar) {
                return false;
            }
        }

        return true;
    }

    public static int[][] fillMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    matrix[i][j] = 1;
                } else if (i == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
                }
            }
        }

        return matrix;
    }

    public static char[] createCharArray(String str) {
        char[] array = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            array[i] = c;
        }

        return array;
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int[] charCount = new int[26];
        String newString = removeDuplicateChars(str);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            charCount[index]++;
        }

        String result = "";

        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            int index = c - 'a';
            result += c + "" + charCount[index];
        }

        return result;
    }

    public static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLowerChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUpperChar(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLowerStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isLowerChar(c)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isUpperStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isUpperChar(c)) {
                return false;
            }
        }

        return true;
    }

    public static String convertLowercase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) + (c + 32);
            } else {
                result += c;
            }
        }

        return result;
    }

    public static String convertUppercase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }

        return result;
    }

    public static void matrix1(int N) {
        int[][] matrix = new int[N][N];

        // fill first row with ones
        for (int j = 0; j < N; j++) {
            matrix[0][j] = 1;
        }

        // fill last row with ones
        for (int j = 0; j < N; j++) {
            matrix[N - 1][j] = 1;
        }

        // fill leftmost column with ones
        for (int i = 0; i < N; i++) {
            matrix[i][0] = 1;
        }

        // fill rightmost column with ones
        for (int i = 0; i < N; i++) {
            matrix[i][N - 1] = 1;
        }

        // fill rest with zeroes
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] != 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        printMatrix(matrix);
    }

    public static void matrix2(int N) {
        int[][] matrix = new int[N][N];

        // fill d1
        for (int i = 0; i < N; i++) {
            matrix[i][i] = 1;
        }

        // fill d2
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                matrix[i][j] = 1;
                i++;
            }
        }

        // calculate midpoint
        int mid = (N - 1) / 2;

        // fill middle column
        for (int i = 0; i < N; i++) {
            matrix[i][mid] = 1;
        }

        // fill middle row
        for (int i = 0; i < N; i++) {
            matrix[mid][i] = 1;
        }

        printMatrix(matrix);
    }
}
