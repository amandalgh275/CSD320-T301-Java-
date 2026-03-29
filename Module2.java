/*
 * Amanda Tirey
 * Module 2 - Energy to Heat Water
 * 3/29/2026
 *
 * Purpose: Calculate the amount of energy needed to heat a given 
 *          mass of water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class Module2 {

    public static void main(String[] args) {
        
        // Create Scanner object to read user input
        try (Scanner input = new Scanner(System.in)) {
            
            // ==================== Get Input from User ====================
            
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = input.nextDouble();
            
            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = input.nextDouble();
            
            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemperature = input.nextDouble();
            
            // ==================== Calculate Energy ====================
            
            // Formula: Q = mass * (finalTemp - initialTemp) * 4184
            double energyInJoules = waterMass * (finalTemperature - initialTemperature) * 4184;
            
            // ==================== Display Result ====================
            
            System.out.printf("%nThe energy needed is %.2f Joules%n", energyInJoules);
            
        } // end try-with-resources
    } // end main method
} // end class Module2