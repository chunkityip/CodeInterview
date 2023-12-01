package Leetcode.Company.JPMorgan;

public class MinimumSuffixFlips {
    /*
        You are given a 0-indexed binary string target of length n. You have another binary string s of length n that is initially set to all zeros. You want to make s equal to target.

        In one operation, you can pick an index i where 0 <= i < n and flip all bits in the inclusive range [i, n - 1]. Flip means changing '0' to '1' and '1' to '0'.

        Return the minimum number of operations needed to make s equal to target.

        Example 1:

        Input: target = "10111"
        Output: 3
        Explanation: Initially, s = "00000".
        Choose index i = 2: "00000" -> "00111"
        Choose index i = 0: "00111" -> "11000"
        Choose index i = 1: "11000" -> "10111"
        We need at least 3 flip operations to form target.
        Example 2:

        Input: target = "101"
        Output: 3
        Explanation: Initially, s = "000".
        Choose index i = 0: "000" -> "111"
        Choose index i = 1: "111" -> "100"
        Choose index i = 2: "100" -> "101"
        We need at least 3 flip operations to form target.
        Example 3:

        Input: target = "00000"
        Output: 0
        Explanation: We do not need any operations since the initial s already equals target.
     */

    public int minFlips(String target) {
        //This question highly asked by JPMorgan

        //Basially we are checking how many time target will become s
        //For example target = 101 , s = 000

        //First character '1' at position 1: Flip at position 1 -> ans = '1', minFlips = 1
        //Second character '0' at position 2: Flip at position 2 -> ans = '0', minFlips = 2
        //Third character '1' at position 3: Flip at position 3 -> ans = '1', minFlips = 3

        int minFlips = 0;
        char digit = '0';

        for (char c : target.toCharArray()) {
            while (c != digit) {
                minFlips++;
                digit = filps(digit);
            }
        }

        return minFlips;
    }

    //A helper method to switch 0 or 1
    private char filps (char c) {
        return c == '0' ? '1' : '0';
    }
}
