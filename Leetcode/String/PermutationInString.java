package Leetcode.String;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int oneLen = s1.length();
        int twoLen = s2.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < oneLen; i++) {
            freq1[s1.charAt(i) - 'a'] ++;
        }

        for (int j = 0; j < twoLen; j++) {
            freq2[s2.charAt(j) - 'a'] ++;

            if (j >= oneLen) {
                freq2[s2.charAt(j - oneLen) - 'a'] --;
            }

            if (Arrays.equals(freq1 , freq2)) return true;
        }
        return false;
    }

}
