package Leetcode.String;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] oneArray = new int[26];
        int[] twoArray = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            oneArray[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            twoArray[s2.charAt(i) - 'a']++;

            /*
            Keep subtracting index i
            For example : s1 = "ab", s2 = "eidbaooo"
            oneArray = 110000.....
            twoArray = 000010001....

            twoArray[s2.charAt(i - s1.length()) - 'a']--;
            remove e , add b on it
            twoArray = 01001000....

            and so on
             */
            if (i >= s1.length()) {
                twoArray[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (Arrays.equals(oneArray , twoArray)) return true;
        }
        return false;
    }

}
