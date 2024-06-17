package Leetcode_Java.Array;

import java.util.HashMap;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        /*
        Using HashMap to store the value of three
        Also , using sliding window from left to right

        Using for loop to iterator thu fruits , right pointer keep forwarding and add it into HashMap

        if the size of HashMap is bigger than 2
        we update the value of key first index subtract to 1
        if the value of key first index is 0 after updated , we areee remove that index since we are looking for max length
        first pointer forward

        finally right - left will be the length we are looking for
        */

        HashMap<Integer , Integer> map = new HashMap<>();
        int left = 0 , maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right] , map.getOrDefault(fruits[right] , 0) + 1);

            //Another loop to ensure the size always within 2
            while (map.size() > 2) {
                map.put(fruits[left] , map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits , right - left + 1);

        }
        return maxFruits;
    }
}
