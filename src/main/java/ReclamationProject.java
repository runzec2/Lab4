/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**Reclamation Project.
 *
 */

public class ReclamationProject {
    /**a function finds the longest common string between two words.
     * @param secondWord is a word
     * @param firstWord is another word
     * @return return the longest common string
     *
     */
    static String doit(final String firstWord, final String secondWord) {
        String word1 = firstWord;
        String word2 = secondWord;
        if (firstWord.length() > secondWord.length()) {
            word1 = secondWord;
            word2 = firstWord;
           }

        String longestCommon = "";
        for (int index = 0; index < word1.length(); index++) {
            for (int backIndex = word1.length() - index; backIndex > 0; backIndex--) {
                for (int index2 = 0; index2 < word2.length() - backIndex; index2++) {
                    if (word1.regionMatches(index, word2, index2, backIndex)) {
                        if (backIndex > longestCommon.length()) {
                            longestCommon = word1.substring(index, index + backIndex);
                        }
                    }
                }
             }
        } return longestCommon;
    }
}

