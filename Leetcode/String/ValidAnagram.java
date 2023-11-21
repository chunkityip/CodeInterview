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
    public static boolean isAnagramThree(String s, String t) {
        //Put s.charAT(i) as key and count as value

        //We are creating a HashMap to put new key as charAt(i) and value as count
        //We put s first  , if we find any same char , we + 1

        //We put t second , now we put new key as charAt(i) and value as count
        //*Noted* Since HashMap not allow duplicate key , if t.charAt(i) are same as s.charAt(i) , we are looking for same key.
        //If map have the same key , we value - 1
        //Therefore , if s and t are anagram , the value should be 0

        //Base case
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Populate the HashMap with character frequencies for string 's' and string 't'
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        //We are checking if any value left
        for (char c : map.keySet()) {
            if (map.get(c) != 0) return false;
        }

        // If the HashMap is empty, they are anagrams
        return true;
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

