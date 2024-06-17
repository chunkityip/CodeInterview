package Leetcode_Java.Array;

import java.util.HashMap;
import java.util.HashSet;

public class UnqiueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n , map.getOrDefault(n , 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();
    }
}
