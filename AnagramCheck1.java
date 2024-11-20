import java.util.Arrays;;

public class AnagramCheck1 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        System.out.println(result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // if the strings has different sizes, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // convert both strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // compare the sorted arrays, if the characters don't match, they are not anagrams.
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // if all the characters matched, return true (they are anagrams)
        return true;
    }
}