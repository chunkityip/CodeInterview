package Leetcode_Java.Company.Accentu;

public class nElements {
    /*
    Given an array containing N elements. Each element is either 0 or 5. Find the largest number
    divisible by 90 that can be made using any number of elements of this array and arranging them in any way.
    Examples:
        Input : arr[] {5,5,5,5,5,5,5,5,5,5,0,5,5}
        Output: 5555555550

        Input : arr[] = {5 ,0}
        Output : 0
     */
    static void printLargestDivisible(int n, int arr[]) {
        int countOfZeros = 0;
        int countOfFives = 0;
        int max = Integer.MIN_VALUE;  // Initialize max for comparison

        // Count the number of 0s and 5s in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                countOfZeros++;
            else
                countOfFives++;
        }

        // Calculate the maximum number of 5s that can be used (multiple of 9)
        countOfFives = (countOfFives / 9) * 9;

        // Check special cases
        if (countOfZeros == 0)
            System.out.print(-1); // The number can't be made a multiple of 10
        else if (countOfFives == 0)
            System.out.println(0); // The only multiple of 90 that can be made is 0
        else {
            // Print the constructed number
            for (int i = 0; i < countOfFives; i++) {
                System.out.print(5);
                max = Math.max(max, 5);  // Update max during printing
            }

            for (int i = 0; i < countOfZeros; i++) {
                System.out.print(0);
                max = Math.max(max, 0);  // Update max during printing
            }

            System.out.println("\nLargest Number: " + max);
        }
    }

    public static void main(String[] args) {
        int array[] = {5, 5, 5, 5, 5, 5, 5, 5, 0, 5, 5};
        int arrayLength = array.length;

        printLargestDivisible(arrayLength, array);
    }
}

