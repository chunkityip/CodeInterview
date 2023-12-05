package Leetcode.Integer;

public class CountNumbersWithUniqueDigits {
    //This question is highly asked in JPMorgan

    public int countNumbersWithUniqueDigits(int n) {
        //n = 1 will be 9 number since unit digit number have 0.....9
        //n = 2 will also be 9 as ten-digit number * 9 as unit digit number (1x , 2x , 3x......9x) , 9 * 9 = 81. 81 + 9 = 92
        //n = 3 will also be 9 as a hundred place digit number * 9 , 9 as ten digit number and unit digit as 8

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += helper(i);
        }

        return ans + 1;
    }

    private int helper(int n) {
        int baseDigit = 9; // Digits will always start at 9
        int addDigit = 9;  // Based on n, will determine how many times we need to add it
        while (n > 1 && addDigit > 1) {
            baseDigit *= addDigit; // 9 * 9 = 81. 81 + 9 = 92
            addDigit--;  //We are founding unique digits , so we need to substract by 1
            n--;//Backtracking of digits , if n = 4 , it will becomes 4 , 3 , 2 , 1
        }
        return baseDigit;
    }
}
