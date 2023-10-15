package Leetcode.String;

import java.util.Locale;

public class ValidPalindrome {

    public static void main (String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output : true;
    }
    /*
    //Simulation 1
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

    //Simulation 2
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
}

