package Leetcode_Java.String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagramByFrequencyCounter(String s, String t) {
        if (s.length() != t.length()) return false;

        int[]arr  = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int a : arr) {
            if (a != 0) return false;
        }

        return true;
    }

    public boolean isAnagramByHashMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character , Integer> sMap = new HashMap<>();
        Map<Character , Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            sMap.put(sChar , sMap.getOrDefault(sChar , 0) + 1);
            tMap.put(tChar , tMap.getOrDefault(tChar , 0) + 1);

        }
        return sMap.equals(tMap);
    }
}
