package Leetcode.Array;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegersAfterKRemovals {

    public int findLeastNumOfUniqueInts (int[] arr , int k) {
        //This question highly asked by JPMorgan

        // Using HashMap to count the duplicate number or unique integer
        // Keys as the number, values as their duplicate number
        // For example: 5 -> 2, 4 -> 1

        HashMap<Integer , Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        // Using PriorityQueue to store natural ordering which the lowest value number first
        // For example: arr = [4,3,1,1,3,3,2], it will become: 1, 1, 2, 3
        // k as 3 - 1 = 2
        // 2 - 1 = 1
        // 1 - 2 = -1, stop

        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while (k > 0) {
            k -= pq.poll();
        }

        //Return the size of the remaining integers which is the most duplicate number in the PriorityQueue
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}
