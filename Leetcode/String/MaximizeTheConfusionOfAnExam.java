package Leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class MaximizeTheConfusionOfAnExam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left = 0 , maxSize = 0;
        Map<Character , Integer> map = new HashMap<>();

        for (int right = 0; right < answerKey.length(); right++) {
            char c = answerKey.charAt(right);
            map.put(c , map.getOrDefault(c , 0) + 1);

            int minSize = Math.min(map.getOrDefault('T' , 0) , map.getOrDefault('F' , 0));

            if (minSize <= k) {
                maxSize++;
            } else {
                char c2 = answerKey.charAt(right - maxSize);
                map.put(c2 , map.get(c2) - 1);
            }
        }
        return maxSize;
    }
}
