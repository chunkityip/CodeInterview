package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class KindsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //The question is asking return true if candies[i] hold the greatest number or candies[i] + extraCandies is bigger or equlas to greatest number
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int c : candies) {
            max = Math.max(max, c);
        }

        //ans will add base on:
        //true if c + extraCandies >= max
        //else , false
        for (int c : candies) {
            ans.add(c + extraCandies >= max);
        }

        return ans;
    }
}

