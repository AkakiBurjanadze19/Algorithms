public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "hello world";

        String withoutWhiteSpaces = removeWhiteSpaces(str);

        System.out.println(withoutWhiteSpaces);
    }

    public static String removeWhiteSpaces(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                continue;
            }
            result.append(c);
        }

        return new String(result);
    }
}
