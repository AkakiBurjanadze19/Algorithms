public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "hello world";

        char oldChar = 'o';
        char newChar = 'a';

        String result = replaceCharacter(str, oldChar, newChar);

        System.out.println(result);
    }

    public static String replaceCharacter(String str, char oldChar, char newChar) {
        // create a StringBuilder object to store the new string
        StringBuilder result = new StringBuilder();

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char currentChar = str.charAt(i);
            // if current character is equal to the old character, replace it with a new character, otherwise don't change it
            if (currentChar == oldChar) {
                result.append(newChar);
            } else {
                result.append(currentChar);
            }
        }

        // convert StringBuilder object back into a string and return it
        return new String(result);
    }
}