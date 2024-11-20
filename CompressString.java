public class CompressString {
    public static void main(String[] args) {
        String str = "aaabb";

        String compressedString = compressString(str);

        System.out.println(compressedString);
    }

    public static String compressString(String str) {
        // handle edge cases: if the string is empty or is not provided at all, return as it is
        if (str == null || str.isEmpty()) {
            return str;
        }

        // create a StringBuilder object to store the compressed string
        StringBuilder result = new StringBuilder();

        // initialize variables to track the current character and its count
        char currentChar = str.charAt(0);
        int count = 1;

        // iterate through the whole string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // grab the next character
            char nextChar = str.charAt(i);

            // check if the current character is the same as the next character and in that case increment the count
            if (currentChar == nextChar) {
                count++;
            } else {
                // if they are different, append the current character and its count to the result
                result.append(currentChar);
                if (count > 1) {
                    result.append(count); // append the count only if it is greater than 1
                }
                // update current character and reset count for the next character group
                currentChar = nextChar;
                count = 1;
            }
        }

        // after the loops ends, append the last character and its count
        result.append(currentChar);
        if (count > 1) {
            result.append(count); // append the count only if it is greater than 1
        }

        // convert StringBuilder back into a string and return it
        return new String(result);
    }
}
