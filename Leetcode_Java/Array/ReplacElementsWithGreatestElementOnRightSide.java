package Leetcode_Java.Array;

public class ReplacElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            //Looking at the largest one
            int nextMax = Math.max(arr[i] , rightMax);
            //Since the position of arr[i] is last element so replace to -1
            arr[i] = rightMax;
            //put it as largest one
            rightMax = nextMax;
        }
        return arr;
    }
}
