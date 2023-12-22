package Leetcode.String;

public class MergeStringAlternately {

    //My solution
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        int oneLength = word1.length();
        int twoLength = word2.length();

        while (i < oneLength || j < twoLength) {
            if (i < oneLength && j < twoLength) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(j));
                i++;
                j++;
            } else if (i == oneLength && j < twoLength) {
                sb.append(word2.charAt(j));
                j++;
            } else if (i < oneLength && j == twoLength) {
                sb.append(word1.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    //Solution 1 : Two pointer (Similar as my answer , just remove the i < oneLength && j < twoLength)
    public String mergeAlternately1(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0 , j = 0;

        int oneLength = word1.length();
        int twoLength = word2.length();

        while (i < oneLength || j < twoLength) {
            if (i < oneLength) {
                sb.append(word1.charAt(i));
                i++;
            }

            if (j < twoLength) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return sb.toString();
    }

    //Solution 2 : One pointer by using Math.max() to check which length is longer
    public String mergeAlternately2 (String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int oneLength = word1.length();
        int twoLength = word2.length();

        for (int i = 0; i < Math.max(oneLength , twoLength); i++) {
            if (i < oneLength) {
                sb.append(word1.charAt(i));
            }

            if (i < twoLength) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
