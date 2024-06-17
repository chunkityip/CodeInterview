package Leetcode_Java.Array;

public class MinimumSwapsToGroupAll1Together {
    public int minSwaps(int[] data) {
        /* The idea is checked the min one with length
        By counting how many one in data , that will be the length
        then we are using two pointer:
        right for iterator thu
        left will increase one once the length of winding is same as the length
        */
        int totalOne = 0;
        for (int num : data) {
            if (num == 1) totalOne++;
        }

        int left = 0 ,maxOne = 0 , currOne = 0;
        for (int right = 0; right < data.length; right++) {
            //Counting how many one in the current window
            currOne += data[right];

            //If the length of winding is same as the length , we need to compare next winding by shifting left pointer
            if (right - left == totalOne - 1) {
                maxOne = Math.max(maxOne , currOne);
                currOne -= data[left];
                left++;
            }
        }
        return totalOne - maxOne;
    }
}
