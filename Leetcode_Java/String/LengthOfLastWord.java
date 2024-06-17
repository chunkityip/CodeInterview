package Leetcode_Java.String;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        if (len == 1) return 1;

        //Since we are checking the last word , backword it
        int i = len - 1 , count = 0;

        //At Example 2 , we know the last index of s may have spance in some test case
        //This loop is to check and move the i forward
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        //Once we found another space , we know the length of last word is over
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
