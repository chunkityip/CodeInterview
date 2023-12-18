package Leetcode.Company.Accentu;

import java.sql.SQLOutput;
import java.util.*;

/*
public static String anagrams(String one , String two) {
        if (one.length() != two.length()) return "no";
        HashSet<Character> oneSet = new HashSet<>();
        HashSet<Character> twoSet = new HashSet<>();

        one = one.toLowerCase();
        two = two.toLowerCase();

        for (char c : one.toCharArray()) {
            oneSet.add(c);
        }
        for (char c : two.toCharArray()) {
            twoSet.add(c);
        }

        if (oneSet.equals(twoSet)) {
            return "yes";
        }
        return "no";
    }

    /*
     public static String anagrams(String one, String two) {
        // Check if lengths are different
        if (one.length() != two.length()) {
            return "no";
        }

        // Create an array to count character occurrences
        int[] count = new int[26]; // Assuming only lowercase letters

        // Count occurrences in the first string
        for (char c : one.toLowerCase().toCharArray()) {
            count[c - 'a']++;
        }

        // Decrement occurrences in the second string
        for (char c : two.toLowerCase().toCharArray()) {
            count[c - 'a']--;
        }

        // Check if all counts are zero
        for (int i : count) {
            if (i != 0) {
                return "no";
            }
        }

        return "yes";
    }
 */


public class anagrams {
    /*
    Input:
    Input 1: 1st string
    Input 2: 2nd string

    Output:
    (If they are anagrams, the function will return ‘yes’. Otherwise, it will return ‘no’.)

    Example
    Input 1: Listen
    Input 2: Silent

    Output:
    Yes

    Explanation

    Listen and Silent are anagrams (an anagram is a word formed by rearranging the letters of the other word).
      public static String anagrams(String one , String two) {
    }

     */

    public static String anagrams(String one , String two) {
        return null;
    }
    //Input 1: Listen
    //Input 2: Silent

    public static void main (String[] args) {

    }



}
