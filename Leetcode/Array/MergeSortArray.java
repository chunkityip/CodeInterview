package Leetcode.Array;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Index to iterate over nums1
        int p2 = n - 1; // Index to iterate over nums2
        int k = m + n - 1; // Index to update nums1 from the end

        //Since nums1 has a length of m + n , we are adding new element into nums1 , no need to create new one
        for (int i = k; i >= 0 ; i--) {
            if (p2 < 0) {
                break;
            }

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
}
