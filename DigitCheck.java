public class DigitCheck {
    public static void main(String[] args) {
        String str = "12345";

        boolean result = containsOnlyDigits(str);

        if (result) {
            System.out.println(str + " contains only digits");
        } else {
            System.out.println(str + " doesn't contain only digits");
        }
    }

    public static boolean containsOnlyDigits(String str) {
        // iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char c = str.charAt(i);
            // if chracter is not a digit, return false 
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // if the loop completes without returning false, return true (string contains only digits)
        return true;
    }
}
