package Leetcode_Java.Array;

public class DietPlanPerformance {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int count = 0 , point = 0;
        for (int i = 0; i < k; i++) {
            count += calories[i];
        }

        if (count < lower) {
            point--;
        } else if (count > upper) {
            point++;
        }

        for (int left = k; left < calories.length; left++) {
            count += calories[left] - calories[left - k];
            if (count < lower) {
                point--;
            } else if (count > upper) {
                point++;
            }
        }
        return point;
    }
}
