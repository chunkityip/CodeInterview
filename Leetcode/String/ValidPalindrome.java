package Leetcode.String;

import java.util.Locale;

public class ValidPalindrome {

    public static void main (String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output : true;
    }
    /*
    //Solution 1
    public static boolean isPalindrome(String s) {
        //Base case
        if (s.length() == 0 || s.length() == 1) return true;

        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase().replaceAll("[^a-z0-9]" , "");

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return s.equals(sb.toString());
    }
     */

    /*Solution 2
    public static boolean isPalindrome(String s) {
        //Base case
        if (s.length() == 0 || s.length() == 1) return true;

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String filter = sb.toString();
        String reverse = sb.reverse().toString();

        return reverse.equals(filter);
    }
     */

    //Solution 3 : Two Pointer
    public static boolean isPalindrome(String s) {

        for (int i = 0 , j = s.length() - 1; i < j; i++ , j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        }

        return true;
    }
}

