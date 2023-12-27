package Leetcode.String;

import java.util.HashMap;

public class LongestPalindrome {

    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c , map.getOrDefault(c , 0) + 1);
        }

        int len = 0;
        boolean oddChar = false;
        for (int n : map.values()) {
            if (n % 2 == 0) {
                len += n;
            } else {
                len += n - 1;
                oddChar = true;
            }
        }
        if (oddChar) {
            len += 1;
        }
        return len;
    }
}
