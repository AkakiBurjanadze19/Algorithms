public class WordCount {
    public static void main(String[] args) {
        String str = "this is a string";

        int wordCount = wordCount(str);

        System.out.println(wordCount);
    }

    public static int wordCount(String str) {
        // trim string to remove any leading and trailing whitespaces
        str = str.trim();

        // if the string is empty, it is clear that there are 0 words
        if (str.isEmpty()) {
            return 0;
        }

        // initialize wordCount variable to keep track of words
        int wordCount = 0;
        // flag to track if we are inside a word
        boolean inWord = false;

        // iterate through the whole string
        for (int i = 0; i < str.length(); i++) {
            // grab character at the current position
            char c = str.charAt(i);
            // check if the current character is space
            if (c == ' ') {
                // if it is space, set inWord to false
                inWord = false;
            } else {
                // if we see a non-empty character, it's part of a word
                if (!inWord) {
                    // increment the wordCount variable 
                    wordCount++;
                    // set the flag to true, indicating we are inside a word
                    inWord = true;
                }
            }
        }

        // return the total word count
        return wordCount;
    }
}