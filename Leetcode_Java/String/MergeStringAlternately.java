package Leetcode_Java.String;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        int pointer1 = word1.length();
        int pointer2 = word2.length();
        int finalLen = pointer1 > pointer2 ? pointer1 : pointer2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= finalLen; i++) {
            if (i < pointer1) {
                sb.append(word1.charAt(i));
            }

            if (i < pointer2) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
