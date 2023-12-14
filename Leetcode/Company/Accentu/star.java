package Leetcode.Company.Accentu;


import java.util.Scanner;

  /*
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N; i >= 0; i--) {

            // Inner loop for spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print("");
            }

            // Inner loop for asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
*/









/*
Print the following Pattern . Given number of rows as input print the below pattern, N= 7 , *******
*******
 ******
  *****
   ****
    ***
     **
      *


 */
public class star {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1 ; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

