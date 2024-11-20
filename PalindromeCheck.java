public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "aba";
        boolean result = isPalindrome(str);

        if (result) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        // remove any spaces and convert the string into lowercase to ensure case-insensitivity
        str = str.replaceAll("\\s", "");

        // initialize two pointers which point to the start of the string and end of the string
        int start = 0;
        int end = str.length() - 1;

        // iterate through the string and compare characters at both ends
        while (start < end) {
            // if characters at start and end pointers don't match, return false
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            // move the start pointer upward and the right pointer backward
            start++;
            end--;
        }

        // if all characters matched, return true (it is a palindrome)
        return true;
    }
}