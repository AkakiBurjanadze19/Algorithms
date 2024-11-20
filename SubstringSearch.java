public class SubstringSearch {
    public static void main(String[] args) {
        String mainString = "this is a sample string";
        String substring = "sample";
        boolean result = containsSubstring(mainString, substring);
        
        if (result) {
            System.out.println("/" + substring + "/" + " is a substring found in " + "/" + mainString + "/");
        } else {
            System.out.println(substring + " was not found in " + mainString);
        }
    } 

    public static boolean containsSubstring(String mainString, String substring) {
        // if the substring is empty, it is always considered to be found
        if (substring.length() == 0) {
            return true;
        }

        // iterate through the main string up the the point where the substring could fit
        for (int i = 0; i <= mainString.length() - substring.length(); i++) {
            // check if the substring matches the section of the main string starting at index i
            boolean matchFound = true;

            for (int j = 0; j < substring.length(); j++) {
                if (mainString.charAt(i + j) != substring.charAt(j)) {
                    // if any character doesn't match, set matchFound to false
                    matchFound = false;
                    // no need to continue checking further characters
                    break;
                }
            }

            // if a match is found, return true
            if (matchFound) {
                return true;
            }
        }
        
        // if the loop completes without finding a match, return false
        return false;
    }
}