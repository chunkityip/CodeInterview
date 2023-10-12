package Leetcode.String;

import java.util.HashMap;

public class ValidAnagram {

    public static void main (String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); //Output: true
        System.out.println(isAnagram("rat", "car"));  //Output: false
    }

    public static boolean isAnagram(String s, String t) {
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
}

