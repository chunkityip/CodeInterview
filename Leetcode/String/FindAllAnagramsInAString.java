package Leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        /*
        The idea is to keep comparing the key and value of s and the key and value of p
        We keep add character into s HashMap and remove the left pointer immediately after adding , and then left++
        If the s HashMap is still same after remove left pointer , we can add the left pointer into new ArrayList
        */

        //Two HashMap , one for s , one for p
        Map<Character , Integer> sMap = new HashMap<>();
        Map<Character , Integer> pMap = new HashMap<>();

        //New ArrayList for storing the answer
        List<Integer> list = new ArrayList<>();

        int pLen = p.length();
        int sLen = s.length();

        //If the length of p is bigger than the length of s , return empty arraylist since it is impossible.
        if (sLen < pLen) return list;

        for (int i = 0; i < pLen; i++) {
            sMap.put(s.charAt(i) , sMap.getOrDefault(s.charAt(i) , 0) + 1);
            pMap.put(p.charAt(i) , pMap.getOrDefault(p.charAt(i) , 0) + 1);
        }

        //HashMap equals() mean check for equality between two maps
        //If s HashMap has same key with same value as p HashMap , it means we found the first Anagrams , add the starting index into arraylist
        if (sMap.equals(pMap)) list.add(0);

        int left = 0;
        while (pLen < sLen) {
            //Since we check the first substring with pLen already , we are going to check next substring
            char startIndex = s.charAt(pLen);
            sMap.put(startIndex , sMap.getOrDefault(startIndex , 0) + 1);
            pLen++;

            //We remove the left pointer immediately after adding
            char removeIndex = s.charAt(left);
            sMap.put(removeIndex , sMap.get(removeIndex) - 1);
            if (sMap.get(removeIndex) == 0) sMap.remove(removeIndex);
            left++;

            //Comparing
            if (sMap.equals(pMap)) list.add(left);

        }
        return list;
    }
}
