public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        String result = removeVowels(str);

        System.out.println(result);
    }

    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                continue;
            }
            result.append(c);
        }

        return result.toString();
    }

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
