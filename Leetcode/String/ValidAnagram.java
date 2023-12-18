package Leetcode.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main (String[] args) {
        System.out.println(isAnagramThree("anagram", "nagaram")); //Output: true
        System.out.println(isAnagramThree("rat", "car"));  //Output: false
    }

    public boolean isAnagramOne(String s, String t) {
        //Using sort

        //Base case
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray , tArray);
    }

    public static boolean isAnagramtwo(String s, String t) {
        //Create two HashMap , key as their char , value as their sum
        //compare their sum

        //Base case
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c , sMap.getOrDefault(c , 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c , tMap.getOrDefault(c , 0) + 1);
        }

        return sMap.equals(tMap);
    }


    //This situation will be use in O(1) space-time
    public boolean isAnagramFour(String s, String t) {
        //Using ASCII code to sum and minus

        //Base case
        if (s.length() != t.length()) return false;

        //Since the English Character has 26
        int[] anagram = new int[26];

        for (int i = 0; i < s.length(); i++) {
            anagram[s.charAt(i) - 'a']++;
            anagram[t.charAt(i) - 'a']--;
        }

        for (int a : anagram) {
            if (a != 0) return false;
        }

        return true;
    }
}

