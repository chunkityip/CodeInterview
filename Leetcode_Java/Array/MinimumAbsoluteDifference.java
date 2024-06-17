package Leetcode_Java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    //This question is highly asked in JPMorgan
   //The whole idea is finding the smallest absolute difference

    //The whole idea is finding the smallest absolute difference
    //For example : [[1,2],[2,3],[3,4]] -> 2 - 1 = 1 , 3 - 2 = 1 , 4 - 3 = 1
    //Their min absolute are all 1 , so they are all smallest absolute differences

    //Step:
    //1. sorted. Therefore , we can minus index i + 1 and index i and store it to new object : current
    //2. Compare current and min

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i + 1] - arr[i];

            if (current == min) {
                ans.add(Arrays.asList(arr[i] , arr[i + 1]));
            } else if (current < min) {
                ans.clear();
                ans.add(Arrays.asList(arr[i] , arr[i + 1]));
                min = current;
            }
        }
        return ans;
    }
}
