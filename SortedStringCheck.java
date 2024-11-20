public class SortedStringCheck {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "hello";

        boolean result1 = isSorted(str1);
        boolean result2 = isSorted(str2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static boolean isSorted(String str) {
        // iterate through the string from the first character to the second last character
        for (int i = 0; i < str.length() - 1; i++) {
            // compare the current character with the next character
            if (str.charAt(i) > str.charAt(i + 1)) {
                // if the current character is greater than the next, the string is not sorted
                return false;
            }
        }

        // if no character is greater than the next character, the string is sorted and we return true
        return true;
    }
}
