public class StringExpansion {
    public static void main(String[] args) {
        String str = "a3b2";

        String expandedString = expandString(str);

        System.out.println(expandedString);
    }

    public static String expandString(String str) {
        // create a StringBuilder object to build the resulting expanded string
        StringBuilder result = new StringBuilder();

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char currentChar = str.charAt(i);

            // check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                // move to the next character to get the number
                i++;

                // initialize another StringBuilder object to store the number as a string
                StringBuilder numberString = new StringBuilder();

                // extract the whole number which could be more than one digit
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    numberString.append(str.charAt(i)); // append digit to the number string
                    i++; // move to the next character
                }

                // convert the number string to an integer
                int count = Integer.parseInt(numberString.toString());

                // append current character 'count' times to the result
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }

                // decrmenet i because the for loop will increment it again at the end
                i--;
            }
        }

        // return the expanded string built from the StringBuilder
        return new String(result);
    }
}
