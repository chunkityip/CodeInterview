package Leetcode.Company.Accentu;

import java.util.Arrays;
import java.util.Scanner;

/*
public static int smallestPair(int[] arr, int n, int sum) {
        if (arr.length == 0 || n < 2) return -1;

        Arrays.sort(arr);

        if (arr[0] + arr[1] <= sum) {
            return arr[0] * arr[1];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n = sc.nextInt();
        System.out.println("Enter sum : ");
        int sum = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " index number: ");
            arr[i] = sc.nextInt();  // Assign user input to array element
        }

        System.out.println("The number will be " + smallestPair(arr, n, sum));
    }
 */

/*
The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example

Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2

Explanation

Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

Sample Input

sum:4

size of Arr = 6

Arr:9 8 3 -7 3 9

Sample Output

-21 as -7 * 3
 */

//Return -1 if array is empty or if n<2
//Return 0, if no such pairs found
public class producstSmallestPair {


}
