package Leetcode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> array = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();

        int left = 0;
        while (left + 10 <= s.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(left, left + 10));

            String sequences = sb.toString();
            map.put(sequences , map.getOrDefault(sequences , 0) + 1);
            if (map.get(sequences) == 2) {
                array.add(sequences);
            }
            left++;
        }
        return array;
    }
}
