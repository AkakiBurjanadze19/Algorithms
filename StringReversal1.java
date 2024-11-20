public class StringReversal1 {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);  
    } 

    public static String reverseString(String str) {
        // handle edge cases: if the string is not given or is empty, return an empty string
        if (str == null || str.isEmpty()) {
            return "";
        }

        // convert string into an array of characters
        char[] array = str.toCharArray();

        // initialize two pointers which point to the start and end of the array
        int start = 0;
        int end = array.length - 1;

        // iterate until start is less than end
        while (start < end) {
            // swap characters at both ends
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // move towards the center
            start++;
            end--;
        }

        // convert array of reversed characters back into a string
        String reversed = new String(array);

        // return the reversed string
        return reversed;
    }
}