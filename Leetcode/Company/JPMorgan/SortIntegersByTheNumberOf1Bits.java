package Leetcode.Company.JPMorgan;

import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    //This question highly asked by JPMorgan

    /*
    You are given an integer array arr. Sort the integers in the array in ascending order
    by the number of 1's in their binary representation and in case of two or more integers have the same
    number of 1's you have to sort them in ascending order.

    Return the array after sorting it.
    Example 1:

    Input: arr = [0,1,2,3,4,5,6,7,8]
    Output: [0,1,2,4,8,3,5,6,7]
    Explanation: [0] is the only integer with 0 bits.
    [1,2,4,8] all have 1 bit.
    [3,5,6] have 2 bits.
    [7] has 3 bits.
    The sorted array by bits is [0,1,2,4,8,3,5,6,7]
    Example 2:

    Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
    Output: [1,2,4,8,16,32,64,128,256,512,1024]
    Explanation: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
     */

    public static int[] sortByBits(int[] arr) {

        //Change arr[i] to bit number and add 10001 for clear separation when sorting
        //Seems it is a rule to add large number like 10001 or 50002
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        //Back to original arr number
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }
}
