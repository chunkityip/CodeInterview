package Leetcode.Array;

public class MergeSortedArray {

    /*
    Solution 1 : Sorting
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);
    }
     */



    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++){
            nums3[i] = nums1[i];
        }
        //Pointer 1 and 2
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < m + n; i++) {
            // 1. p2 >= n: Finish adding nums2, continue adding the rest of the nums1.
            // 2. p1 < m && nums1[p1] < nums2[p2]:
            //    - We need to make sure it wouldn't result in an index out of bounds as p1 and m.
            //    - We are comparing the smaller value between nums1 and nums2.

            if (p2 >= n || p1 < m && nums3[p1] < nums2[p2]) {
                nums1[i] = nums3[p1++];
            } else {
                nums1[i] = nums2[p2++];
            }
        }
    }
}
