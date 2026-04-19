// Name: Amanda Tirey
// Date: April 13, 2026
// Module 5 - Math Series with While Loop

// Purpose: This program calculates and displays the sum of fractions with odd denominators
//          from 3 to 99, first in ascending order and then in descending order.

package module5;

public class Module5 {
    
    public static void main(String[] args) {
        
        // Display program header
        System.out.println("=".repeat(60));
        System.out.println("        MATH SERIES: ODD DENOMINATORS 3 THROUGH 99");
        System.out.println("=".repeat(60));
        
        // Calculate and display series in ascending order (3 to 99)
        System.out.println("\n--- SERIES 1: ASCENDING ORDER (3 to 99) ---");
        calculateAscendingSeries();
        
        // Add blank line between sections for readability
        System.out.println();
        
        // Calculate and display series in descending order (99 to 3)
        System.out.println("--- SERIES 2: DESCENDING ORDER (99 to 3) ---");
        calculateDescendingSeries();
        
        // End message
        System.out.println("\n" + "=".repeat(60));
        System.out.println("Program complete.");
    }
    
    /**
     * This method calculates the sum of 1/denominator for odd denominators
     * from 3 to 99 in ascending order and displays each term with the running total.
     */
    public static void calculateAscendingSeries() {
        
        // Initialize variables
        int denominator = 3;           // Starting denominator (first odd number)
        double runningSum = 0.0;       // Accumulator for the sum
        int termCount = 0;              // Counter to track how many terms are displayed
        
        // While loop iterates from denominator 3 up to 99
        while (denominator <= 99) {
            
            // Calculate the current term value
            double term = 1.0 / denominator;
            
            // Add current term to running sum
            runningSum = runningSum + term;
            
            // Increment term counter
            termCount++;
            
            // Display the current term with formatting
            System.out.printf("Term %2d: 1/%-2d = %.4f | Running Sum: %.6f%n", 
                              termCount, denominator, term, runningSum);
            
            // Move to the next odd denominator (increment by 2)
            denominator = denominator + 2;
        }
        
        // Display final result
        System.out.println("\n" + "-".repeat(60));
        System.out.printf("FINAL SUM (Ascending): %.6f%n", runningSum);
        System.out.printf("Total terms calculated: %d%n", termCount);
    }
    
    /**
     * This method calculates the sum of 1/denominator for odd denominators
     * from 99 down to 3 in descending order and displays each term with the running total.
     */
    public static void calculateDescendingSeries() {
        
        // Initialize variables
        int denominator = 99;           // Starting denominator (largest odd number)
        double runningSum = 0.0;        // Accumulator for the sum
        int termCount = 0;               // Counter to track how many terms are displayed
        
        // While loop iterates from denominator 99 down to 3
        while (denominator >= 3) {
            
            // Calculate the current term value
            double term = 1.0 / denominator;
            
            // Add current term to running sum
            runningSum = runningSum + term;
            
            // Increment term counter
            termCount++;
            
            // Display the current term with formatting
            System.out.printf("Term %2d: 1/%-2d = %.4f | Running Sum: %.6f%n", 
                              termCount, denominator, term, runningSum);
            
            // Move to the next odd denominator (decrement by 2)
            denominator = denominator - 2;
        }
        
        // Display final result
        System.out.println("\n" + "-".repeat(60));
        System.out.printf("FINAL SUM (Descending): %.6f%n", runningSum);
        System.out.printf("Total terms calculated: %d%n", termCount);
    }
}