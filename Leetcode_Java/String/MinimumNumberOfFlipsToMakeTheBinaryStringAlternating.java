package Leetcode_Java.String;

public class MinimumNumberOfFlipsToMakeTheBinaryStringAlternating {
    public int minFlips(String s) {
        /*
        Alternating means: To repeatedly and regularly interchange with one another in time or place

        To make a String Alternating , it only have two situations:::
        1. start at 0 , as 0101010.....
        2. start at 1 , as 1010101.....

        */
        int stringLength = s.length();

        // String to represent the pattern "01" which we want to alternate in the final string
        String alternatingPattern = "01";

        // Count the number of mismatches between the input string and the pattern
        int mismatches = 0;
        for (int i = 0; i < stringLength; ++i) {
            if (s.charAt(i) != alternatingPattern.charAt(i % 2)) {
                ++mismatches;
            }
        }

        // Calculate the minimal flips needed as the minimum between mismatches
        // and the complement to the length of the string (because we can flip either "0"s or "1"s)
        int minFlips = Math.min(mismatches, stringLength - mismatches);

        // This for loop mimics the idea of a circular array by going once more through the string,
        // and adjusting mismatch count as if the string was rotated.
        for (int i = 0; i < stringLength; ++i) {
            // If the current character does not match the alternating pattern,
            // we remove one from mismatches assuming that character is moved to the back
            if (s.charAt(i) != alternatingPattern.charAt(i % 2)) {
                --mismatches;
            }

            // As the character "moves" to the end of the string, we need to check it against
            // the complementing pattern index.
            if (s.charAt(i) != alternatingPattern.charAt((i + stringLength) % 2)) {
                ++mismatches;
            }

            // Re-calculate the minimum flips after each rotation.
            minFlips = Math.min(minFlips, Math.min(mismatches, stringLength - mismatches));
        }

        // After going through all possible rotations, return the minimum flips found.
        return minFlips;
    }
}
