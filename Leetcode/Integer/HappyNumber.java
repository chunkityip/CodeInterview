package Leetcode.Integer;

import java.util.HashSet;

public class HappyNumber {

    public static void main (String [] args) {
        System.out.println(isHappy(19));   //Output: true
    }

    public static boolean isHappy(int n) {
        //The question is asking the loops endlessly in a cycle
        //Enlessly mean the number can't be same
        //We can use Hashset to store the number , if hashset contains the number already , return false
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            int digit = n;
            int sum = 0;
            while (digit != 0) {
                //(digit % 10) as 19 % 10 = 9
                //(digit % 10) * (digitt % 10) as 9 ^ 2
                sum += (digit % 10) * (digit % 10);
                //We just figit sum the last digit , now we need to looking for first digit
                //19 / 10 = 1.9 = 1
                digit /= 10;
            }
            //it contains the number already , return false
            if (set.contains(sum)) {
                return false;
            }

            //Add the sum into set
            set.add(sum);
            //A new number is created , loop it.
            n = sum;

        }
        return true;
    }
}
