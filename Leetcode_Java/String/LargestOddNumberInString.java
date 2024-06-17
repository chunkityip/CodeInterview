package Leetcode_Java.String;

public class LargestOddNumberInString {

    public static void main (String[] args) {
        System.out.println(largestOddNumber("52"));   //Output: 5
    }

    //The least significant digit determines whether a number is odd or even
    //So we just loop backward to check the last index of odd number

    public static String largestOddNumber(String num) {
        if (num.length() == 0) return "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) return num.substring(0 , i + 1);
        }
        return "";
    }
}

