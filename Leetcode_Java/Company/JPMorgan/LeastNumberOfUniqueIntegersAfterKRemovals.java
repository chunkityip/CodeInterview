package Leetcode_Java.Company.JPMorgan;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
    Given an array of integers arr and an integer k. Find the least number of unique integers after
    removing exactly k elements.


    Example 1:
    Input: arr = [5,5,4], k = 1
    Output: 1
    Explanation: Remove the single 4, only 5 is left.
    Example 2:
    Input: arr = [4,3,1,1,3,3,2], k = 3
    Output: 2
    Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 */

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
