package Leetcode.Company.Accentu;

public class differenceOfSum {
    //Create two integer object , div and notDiv
    //div will be store the number if (m % 6 == 0)
    //notDiv will be store the number if (m % 6 != 0)

    public static int sum(int m , int n) {
        int div = 0 , notDiv = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                div += i;
            } else {
                notDiv += i;
            }
        }
        return Math.abs(div - notDiv);
    }

    public static void main (String[] args) {
        System.out.println(sum(6 , 30));
    }
}
