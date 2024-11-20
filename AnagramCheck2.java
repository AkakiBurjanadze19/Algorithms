public class AnagramCheck2 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        boolean result = areAnagrams(str1, str2);
        System.out.println(result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // if the sizes of two strings differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println(false);
        }

        // convert both strings into lowercase to ensure case insensitivity
        String str1Lower = str1.toLowerCase();
        String str2Lower = str2.toLowerCase();

        // create two 26 size integer arrays to store frequencies of characters of both strings
        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        // count frequencies of characters of the first string
        for (int i = 0; i < str1Lower.length(); i++) {
            char c = str1Lower.charAt(i);
            charCount1[c - 'a']++;
        }

        // count frequenices of characters of the seconds string
        for (int i = 0; i < str2Lower.length(); i++) {
            char c = str2Lower.charAt(i);
            charCount2[c - 'a']++;
        }

        // if frequencies don't match, return false
        for (int i = 0; i < charCount1.length; i++) {
            if (charCount1[i] != charCount2[i]) {
                return false;
            }
        }

        // if all the frequencies matched, return true (they are anagrams)
        return true;
    }
}