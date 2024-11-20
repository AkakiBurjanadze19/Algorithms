public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "hello world";

        String withoutWhiteSpaces = removeWhiteSpaces(str);

        System.out.println(withoutWhiteSpaces);
    }

    public static String removeWhiteSpaces(String str) {
        // handle edge cases where string might be empty or not provided at all
        if (str == null || str.isEmpty()) {
            return "";
        }

        // create a StringBuilder object where we will store string without spaces
        StringBuilder result = new StringBuilder();

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char c = str.charAt(i);
            // check if current character is a whitespace and in that case ignore it
            if (c == ' ') {
                continue;
            }
            // if character is not a whitespace, append it to the StringBuilder
            result.append(c);
        }

        // convert StringBuilder back into a string and return it
        return new String(result);
    }
}