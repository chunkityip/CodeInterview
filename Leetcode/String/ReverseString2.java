package Leetcode.String;

public class ReverseString2 {

    public static void main (String[] args) {
        System.out.println(reverseStr("abcdefg" , 2));  //Output: "bacdfeg"
    }
    public static String reverseStr(String s, int k) {
        //The main idea is creating two pointer:
        //1. Pointer start to i += 2 * k since it will double 2k everytime
        //2. Pointer end = i + k - 1.

        //We are checking c.length to avoid indexOutOfBloud
        char[] c = s.toCharArray();
        int len = c.length;

        for (int i = 0; i < len; i += 2 * k) {
            int start = i , end = Math.min(i + k - 1, len - 1);

            // Reverse characters from start to end
            swap(c , start , end);
        }

        return new String(c);
    }


    //The swap method
    private static void swap(char[] c , int start , int end) {
        while (start < end) {
            char temp = c[start];
            c[start++] = c[end];
            c[end--] = temp;
        }
    }
}
