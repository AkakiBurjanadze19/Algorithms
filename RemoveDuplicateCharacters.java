public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello";

        String withoutDuplicates = removeDuplicateChars(str);
        
        System.out.println(withoutDuplicates);
    }

    public static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        boolean[] seen = new boolean[26];

        StringBuilder result = new StringBuilder();

        // only append if the current character has not seen before
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';

            if (!seen[index]) {
                result.append(c);
                seen[index] = true;
            }
        }

        return new String(result);
    }
}