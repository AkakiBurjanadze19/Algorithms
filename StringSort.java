public class StringSort {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        return new String(charArray);
    }
}
