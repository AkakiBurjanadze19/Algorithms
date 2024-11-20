public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        String result = removeVowels(str);

        System.out.println(result);
    }

    public static String removeVowels(String str) {
        // create a StringBuilder object where we will store the string without vowels
        StringBuilder result = new StringBuilder();

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char c = str.charAt(i);
            // check if it is vowel and in that case just skip it
            if (isVowel(c)) {
                continue;
            }
            // otherwise append it to the StringBuilder object
            result.append(c);
        }

        // convert StringBuilder back into a string and return it
        return result.toString();
    }

    // this method checks wheter a given character is a vowel or not
    public static boolean isVowel(char c) {
        char lowerChar = Character.toLowerCase(c);

        if (lowerChar == 'a'
        || lowerChar == 'e'
        || lowerChar == 'i'
        || lowerChar == 'o'
        || lowerChar == 'u') {
            return true;
        }

        return false;
    }
}
