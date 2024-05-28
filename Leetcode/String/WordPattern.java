package Leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        Map map = new HashMap();
        String[] word = s.split(" ");

        if (pattern.length() != word.length) return false;

        for (int i = 0; i < word.length; i++) {
            char c = pattern.charAt(i);
            String w = word[i];

            if (!map.containsKey(c)) map.put(c, word[i]);
            if (!map.containsKey(word[i])) map.put(word[i], c);

            if (map.get(c) != map.get(w)) return false;
        }

        return true;
    }
}
