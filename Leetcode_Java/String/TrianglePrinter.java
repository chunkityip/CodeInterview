package Leetcode_Java.String;

import java.util.Scanner;

public class TrianglePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose triangle orientation: ");
        System.out.println("1. Upwards");
        System.out.println("2. Downwards");
        System.out.println("3. Leftwards");
        System.out.println("4. Rightwards");

        int choice = scanner.nextInt();

        System.out.println("Enter the size of the triangle: ");
        int size = scanner.nextInt();

        switch (choice) {
            case 1:
                printUpwardsTriangle(size);
                break;
            case 2:
                printDownwardsTriangle(size);
                break;
            case 3:
                printLeftwardsTriangle(size);
                break;
            case 4:
                printRightwardsTriangle(size);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static void printUpwardsTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printDownwardsTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printLeftwardsTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRightwardsTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = size; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
