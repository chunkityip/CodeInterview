package Leetcode_Java.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumNumberOfOccurrencesOfASubstring {

    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        //The idea is to create substring and store in the HashMap
        //the size of substring is left point , left point + minSize since the max min size is minSize

        //At the substring , store the character into a HashSet and check the size of substring
        //If the size is small or equal to MaxLetters , the value of that substring will add by 1
        //and then we are returing the value of substring since the question is asking return the maximum number of occurrences of any substring
        int max = 0;
        Map<String , Integer> map = new HashMap<>();

        for (int left = 0; left <= s.length() - minSize; left++) {
            String substring = s.substring(left , left + minSize);

            Set<Character> set = new HashSet<>();
            for (int i = 0; i < minSize; i++) {
                set.add(substring.charAt(i));
            }

            if (set.size() <= maxLetters) {
                map.put(substring , map.getOrDefault(substring , 0) + 1);
                max = Math.max(max , map.get(substring));
            }
        }
        return max;
    }
}
