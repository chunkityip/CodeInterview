package Leetcode.Array;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //Since they can't planted in adjacent plots , it means the first index nus be empty and after index nums must be empty
        //[i - 1] , [i] and [i + 1] must be 0 && flowerbed length must be >= n * 3

        //Also , the edge case we need to deal with it

        int len = flowerbed.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }

                }
            }
        }
        return count >= n;
    }
}

