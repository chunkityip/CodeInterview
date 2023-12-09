package Leetcode.Company.Accentu;
import java.util.Scanner;


    /*
       The function accepts string str of size n as an argument. Implement the function which
       returns 1 if given string str is valid password else 0.

       str is a valid password if it satisfies the below conditions.

            – At least 4 characters k
            – At least one numeric digit k
            – At Least one Capital Letter k
            – Must not have space or slash (/) k
            – Starting character must not be a number k

            Assumption:
            Input string will not be empty. k
     */


public class passwordCheck {
    public static int checkPassword(String str, int n) {
        //Edge case
        if (str.length() < 4) return 0;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') return 0;


        int num = 0, cap = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') num++;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') cap++;
            if (str.charAt(i) == ' ' && str.charAt(i) == '/') return 0;
        }
        if (num > 0 && cap > 0) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = sc.next();
        System.out.println(checkPassword(str, str.length()));
    }
}

