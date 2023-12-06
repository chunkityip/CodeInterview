package Leetcode.Array;

import java.util.TreeSet;

public class MakeArrayZeroBySubtractingEqualAmounts {
    //Basically , once we found how any unique number in the array , that number will be the answer
    //numbs = [1,5,0,3,5] , there have 3 unique number , 1 , 3 and 5. 0 wasn't because the question said less than or equal to the smallest "non-zero" element

    //Sort the array , or Using TreeSet since TreeSet already follow national order
    //just return the size because HashSet or TreeSet don't allow duplicate number
    public int minimumOperations(int[] nums) {
    TreeSet<Integer> set = new TreeSet<>();
      for (int n : nums) {
        //smallest non-zero element
        if (n >= 1) {
            if (!set.contains(n)) {
                set.add(n);
            }
        }
    }
      return set.size();
    }
}
