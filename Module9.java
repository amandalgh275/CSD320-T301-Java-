/*
 * Name: Amanda Tirey
 * Date: 5/17/2026
 * Module9 – Array Statistics
 * 
 * Purpose: Read 20 integers into an array and display the highest, lowest, average, and sum.
 */
package module9;

import java.util.Scanner;

public class Module9 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Constant for the number of elements
        final int ARRAY_SIZE = 20;
        
        // Declare and create an array to hold 20 integers
        int[] numbers = new int[ARRAY_SIZE];
        
        // Display instruction to the user
        System.out.println("Please enter " + ARRAY_SIZE + " integers:");
        
        // Read 20 integers from the user and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = keyboard.nextInt();
        }
        
        // Close the scanner to prevent resource leak
        keyboard.close();
        
        // Calculate the required statistics
        int highest = findHighest(numbers);
        int lowest = findLowest(numbers);
        double average = calculateAverage(numbers);
        int sum = calculateSum(numbers);
        
        // Display the results in a readable format
        System.out.println("\n===== Array Statistics =====");
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value:  " + lowest);
        System.out.printf("Average:       %.2f%n", average);
        System.out.println("Sum:           " + sum);
    }
    
    /**
     * Finds the highest value in an integer array.
     * 
     * @param arr the array to search
     * @return the maximum value found
     */
    public static int findHighest(int[] arr) {
        int max = arr[0]; // assume first element is largest initially
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Finds the lowest value in an integer array.
     * 
     * @param arr the array to search
     * @return the minimum value found
     */
    public static int findLowest(int[] arr) {
        int min = arr[0]; // assume first element is smallest initially
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Calculates the sum of all elements in an integer array.
     * 
     * @param arr the array to sum
     * @return the total sum
     */
    public static int calculateSum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    
    /**
     * Calculates the average of all elements in an integer array.
     * 
     * @param arr the array to average
     * @return the average as a double
     */
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
}
