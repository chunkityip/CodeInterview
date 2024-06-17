package Leetcode_Java.String;

public class MinimumSuffixFlips {

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
