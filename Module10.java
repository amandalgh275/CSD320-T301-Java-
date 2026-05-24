package module10;   

/**
 * Name: Amanda Tirey
 * Date: 5/24/2026
 * Module 10: Overloaded Average Methods
 * Purpose: Demonstrate method overloading by computing averages of numeric arrays
 *          of different primitive types (short, int, long, double).
 */

import java.util.Arrays;

public class Module10 {

    // Method for short array - returns truncated short average
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method for int array - returns truncated int average
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method for long array - returns truncated long average
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for double array - returns exact double average
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {
        // Arrays of different sizes as required
        short[] shortArray = {10, 20, 30};                 // size 3
        int[] intArray = {5, 15, 25, 35};                  // size 4
        long[] longArray = {100L, 200L, 300L, 400L, 500L}; // size 5
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5}; // size 6

        System.out.println("=== Overloaded Average Methods Demo ===\n");

        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average (as short, truncated): " + average(shortArray) + "\n");

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average (as int, truncated): " + average(intArray) + "\n");

        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average (as long, truncated): " + average(longArray) + "\n");

        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.printf("Average (as double, exact): %.2f%n", average(doubleArray));
    }
}