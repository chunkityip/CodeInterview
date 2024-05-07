package Leetcode.String;

import java.util.Locale;

public class ValidPalindrome {

    public static void main (String[] args) {
        System.out.println(isPalindrome("race a car"));
    }


    //Solution 3 : Two Pointer
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

