public class StringReversal2 {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }   

    public static String reverseString(String str) {
        // create a new StringBuilder object which will be used to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // iterate through the string backwards
        for (int i = str.length() - 1; i >= 0; i--) {
            // append character at the current position to the StringBuilder
            reversed.append(str.charAt(i));
        }

        // convert StringBuilder object back into a string and return it
        return reversed.toString();
    }
}
