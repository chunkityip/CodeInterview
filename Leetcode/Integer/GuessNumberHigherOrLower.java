package Leetcode.Integer;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int low = 0;

        while (low <= n) {
            int mid = low + (n - low) / 2;
            //Using API provide by Leetcode
            int compare = guess(mid);

            // your guess is equal to the number I picked (i.e. num == pick)
            if (compare == 0) {
                return mid;
            } else if (compare == -1) {
                n = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Your guess is higher than the number I picked (i.e. num > pick)
        return -1;
    }

    /*JS version
    var guessNumber = function(n) {
        let left = 0;
        while (left <= n) {
            let mid = left + Math.floor((n - left) / 2);
            let compare = guess(mid);

            if (compare == 0) {
                return mid;
            } else if (compare == -1) {
                n = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    };
     */
}
