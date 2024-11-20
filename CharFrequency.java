import java.util.Arrays;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        int[] freq = countCharFrequency(str);

        System.out.println(Arrays.toString(freq));
    }

    public static int[] countCharFrequency(String str) {
        // if the string is not given or is empty, return an empty array
        if (str == null || str.isEmpty()) {
            return new int[]{};
        }

        // create an array of size 26 where we will store frequencies of each character
        int[] freq = new int[26];

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char c = str.charAt(i);
            // increment character frequency
            freq[c - 'a']++;
        }

        // return an array of character frequencies
        return freq;
    }
}