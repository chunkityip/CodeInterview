package Leetcode.Company.Accentu;

public class operation {
    /*
        Perform the function: Int operationchoices(int c, int n, int a, int b). This function considers three positive inputs of a, b and c.
        Execute the function to get:
        (a + b), if c = 1
        (a / b), if c = 4
        (a – b), if c = 2
        (a x b), if c = 3

        Example:

        Input:
        a: 12
        b: 16
        c: 1

        Output:
        28

        Explanation
        C = 1, hence the function is (a + b). Hence, the output is 28.

        Sample input:
        a: 16
        b: 20
        c: 2

        Sample output:
        –4
     */
    public static int operationChoices(int c , int a , int b) {

    }

    public static void main (String[] args) {
        System.out.println(operationChoices(1 , 12 , 16));
        System.out.println(operationChoices(2 , 16 , 20));
    }
}
