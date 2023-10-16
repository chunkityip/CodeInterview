package Leetcode.String;

import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharacters {

    public static void main (String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa")); //Output : 0
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        //Base case
        if (s.length() <= 1) return -1;

        int count = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                count = Math.max(count , i - 1 - map.get(c));
            } else {
                map.put(c , i);
            }
        }
        return count;
    }
}
