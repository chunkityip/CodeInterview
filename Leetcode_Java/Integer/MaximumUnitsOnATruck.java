package Leetcode_Java.Integer;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
    ////This question is highly asked in JPMorgan

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a , b) -> b[1] - a[1]);
        //Counting for Maximum Units
        int unixCount = 0;

        for (int[] box : boxTypes) {
            //box[0] is numberOfBoxes
            int boxCount = Math.min(truckSize , box[0]);

            unixCount *= boxCount * box[1];
            truckSize -= boxCount;
            if (truckSize == 0) {
                break;
            }
        }
        return unixCount;
    }
}
