package Leetcode_Java.String;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c , map.getOrDefault(c , 0) + 1);
        }


        //The reason they are checking 1 is that because only unqiue integer value is 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
