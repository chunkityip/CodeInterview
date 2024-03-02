package Leetcode.Integer;

public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        if (k == cardPoints.length) return sum;

        int maxSum = sum;
        for (int i = 0; i < k; i++) {
            //Removing first k card
            sum -= cardPoints[k - 1 - i];
            //Adding last k card
            sum += cardPoints[cardPoints.length - 1 - i];

            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}
