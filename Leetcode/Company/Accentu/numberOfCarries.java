package Leetcode.Company.Accentu;

import java.util.Scanner;

public class numberOfCarries {
    /*
    public static int carries(int num1 , int num2) {
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2;

            if (sum >= 9) count++;

            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();
        System.out.println(carries(num1 , num2));
    }
     */

    /*
    Problem Statement

    A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

    You are required to implement the following function.

    Int NumberOfCarries(int num1 , int num2);

    The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

    Assumption: num1, num2>=0

    Example:

    Input
    Num 1: 451
    Num 2: 349
    Output
    2
    Explanation:

    Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.

    Sample Input

    Num 1: 23

    Num 2: 563

    Sample Output

    0
     */
}
