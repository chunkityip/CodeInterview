package Leetcode.String;

import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] oneArray = new int[26];
        int[] twoArray = new int[26];

        //store character as number
        for (int i = 0; i < s1.length(); i++) {
            oneArray[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            twoArray[s2.charAt(i) - 'a']++;

            //Since we are comparing s1.length into s2
            //s1.length meaning the length of sliding window
            if (i >= s1.length()) {
                twoArray[s2.charAt(i - s1.length()) - 'a']--;
            }

            //If we found permutation , return true;
            /*
            How it work:
            since we limit the length of sliding window, we insure the length is curret
            and since at Frequencies array only store integer
            Ex: "ab" == 11 , "ba" == 11 , "ad" = 1001 , "da" = 1001
            so no matter the order is same or not , we don't care as long as
            the index is same
            */
            if(Arrays.equals(oneArray , twoArray)) return true;
        }
        return false;
    }
}
