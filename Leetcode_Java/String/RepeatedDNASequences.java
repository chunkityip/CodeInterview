package Leetcode_Java.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
The idea is if the substring duplication or more then 2 times , return it

So We can just create one ArrayList and HashMap

At the loop , i + 10 <= length of s since the question request `10`-letter-long sequences

Also using StringBuilder to append the substring by 0 to 10

And adding it into HashMap

Once the value of that substring duplication or more than 2 times , we can add it into ArrayList and return it
 */


public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
            List<String> array = new ArrayList<>();
            Map<String , Integer> map = new HashMap<>();

            for (int left = 0; left + 10 <= s.length(); left++) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(left , left + 10));

                String substring = sb.toString();
                map.put(substring , map.getOrDefault(substring , 0) + 1);

                if (map.get(substring) == 2) array.add(substring);
            }
            return array;
        }
}
