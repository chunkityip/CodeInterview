package Leetcode.Integer;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 0;

        while (left <= n) {
            int mid = left + (n - left) / 2;
            //gues is pre-defined API int guess(int num), which returns three possible results
            int compare = guess(mid);
            if (compare == 0) {
                return mid;
            } else if (compare == -1) {
                n = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //JS version
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
}
