package Leetcode_Java.String;

import java.util.Arrays;

public class PermutationInString {

    //A method to use for loop
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

            if (i >= s1.length()) {
                twoArray[s2.charAt(i - s1.length()) - 'a']--;
            }

            if(Arrays.equals(oneArray , twoArray)) return true;
        }
        return false;
    }

    //A method to use while loop
    public boolean checkInclusionTwo(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Array = new int[26];
        int[] s2Array = new int[26];

        int right = 0;

        while (right < s1.length()) {
            s1Array[s1.charAt(right) - 'a']++;
            s2Array[s2.charAt(right) - 'a']++;
            right++;
        }

        while (right < s2.length()) {
            if (Arrays.equals(s1Array , s2Array)) return true;

            s2Array[s2.charAt(right) - 'a']++;

            if (right >= s1.length()) {
                s2Array[s2.charAt(right - s1.length()) - 'a']--;
            }

            right++;
        }

        return Arrays.equals(s1Array , s2Array);
    }
}
