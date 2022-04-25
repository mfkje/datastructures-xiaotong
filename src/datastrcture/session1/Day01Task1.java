package datastrcture.session1;

import java.util.Scanner;

public class Day01Task1 {
    public static void main(String[] args) {
//        ask user for the size of the array to create, it must be 1 or greater
//        show an error and end program if it's invalid
//        do not allow the program to crash if the entered value is  not numerical
//        show an error and end the program
//        allocarte the array of int values of the size user requested
//        generate random numbers 1-100 and assign them to each item of that array
//        display all numbers from the array, commea separated on a single line
//        find and display all numbers in that array are prime numbers,comma-separated on a single line

        int size = 0;
        int[] array = new int[size];
        int[] primeArray = new int[size];
        int count = 0;
        int primeCount = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size < 1) {
                throw new IllegalArgumentException("Not a valid number.");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


        array = new int[size];
        primeArray = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.printf("\n");

        for (int i = 0; i < size; i++) {
            if (isPrime(array[i])) {
                primeArray[primeCount] = array[i];
                primeCount++;
            }
        }

        for (int i = 0; i < primeCount; i++) {
            System.out.print(primeArray[i] + ", ");
        }
        System.out.println("prime numbers are:");
        System.out.println("\n");
    }

    ;

    //    private static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}


