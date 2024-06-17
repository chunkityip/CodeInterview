package Leetcode_Java.Array;

public class ReplacElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        //We are backtracking from the last inde . Keep storeing the last greatest element and replace it

        //We start at -1 since the question say replace the last element with -1.
        int rightMax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int nextMax = Math.max(arr[i] , rightMax);
            arr[i] = rightMax;
            rightMax = nextMax;
        }

        return arr;
    }
}
