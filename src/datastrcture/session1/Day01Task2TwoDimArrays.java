package datastrcture.session1;

import java.util.Scanner;

public class Day01Task2TwoDimArrays {
//    Ask user for width and height of an array.
//    Values must be numerical, 1 or greater.
//    If not display an error message and end the program.
//
//    Allocate two-dimensional array of integers of given width and height.
//
//    Generate random values from -99 to 99 and assign to each cell of the array.
//
//    Display the array to the user in a user-friendly manner, where columns have all the same width (commas align). Example:
//
//            -99,  2  ,  22
//            15, -71,  5
//
//    Compute and display:
// 1) Sum of all numbers in the array
//2) Sum of each of the row of the array
//3) Sum of each of the column of the array
//4) Standard deviation of all numbers in the array (google it !!!)
//5) Find pairs of numbers in the array whose sum is a prime number and display those pairs and their sum.
//            (assume that negative number is not a prime number)

    public static void main(String[] args) {
        int sum = 0;
        int sumRow = 0;
        int sumCol = 0;
        double mean = 0;
        int sumPair = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the array: ");
        int width = sc.nextInt();
        System.out.println("Enter the height of the array: ");
        int height = sc.nextInt();

        int[][] arr = new int[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                arr[i][j] = (int) (Math.random() * 199) - 99;
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of all numbers in the array: " + sum);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sumRow += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sumRow);
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sumCol += arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + ": " + sumCol);
        }
      mean = sum / (width * height);
        sum = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sum += Math.pow((arr[i][j]-mean),2);
            }
        }
//        System.out.println("Standard deviation of all numbers in the array:
//        " + Math.sqrt((sum - (width * height * mean)) / (width * height - 1)));
       mean = sum / (width * height);
        double stdDev = Math.sqrt(mean);
        System.out.println("Standard deviation of all numbers in the array: " + stdDev);
    };
}