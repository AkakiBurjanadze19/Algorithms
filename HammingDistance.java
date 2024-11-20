public class HammingDistance {
    public static void main(String[] args) {
        String str1 = "aaabc";
        String str2 = "aacbd";

        int hammingDistance = calculateHammingDistance(str1, str2);

        System.out.println(hammingDistance);
    }

    public static int calculateHammingDistance(String str1, String str2) {
        // if the strings are not the same size, we can't calculate the hamming distance
        if (str1.length() != str2.length()) {
            return -1;
        }

        // intialize distance variable to keep track of the hamming distance
        int distance = 0;

        // iterate through the whole string
        for (int i = 0; i < str1.length(); i++) {
            // check if character at the current position in str1 is not equal to the character at the current position in str2
            if (str1.charAt(i) != str2.charAt(i)) {
                // increment distance variable
                distance++;
            }
        }

        // return the distance (the number of positions where the two strings differ)
        return distance;
    }
}