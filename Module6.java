// Name: Amanda Tirey
// Date: April 20, 2026
// Module 6 - Number Pattern with Nested For Loops

// Purpose: This program uses nested for loops to display a centered triangular number pattern
//          with "@" symbols perfectly aligned and placed as close as possible to the numbers.

package module6;

public class Module6 {
    
    public static void main(String[] args) {
        
        System.out.println("Number Pattern Program");
        System.out.println("---");
        
        int numberOfRows = 7;
        
        // Generate each row's number sequence
        String[] rows = new String[numberOfRows];
        
        for (int row = 0; row < numberOfRows; row++) {
            int peakValue = (int) Math.pow(2, row);
            StringBuilder sequence = new StringBuilder();
            
            // Ascending numbers: 1, 2, 4, ..., peakValue
            for (int value = 1; value <= peakValue; value = value * 2) {
                sequence.append(value).append(" ");
            }
            
            // Descending numbers: peakValue/2 down to 1
            for (int value = peakValue / 2; value >= 1; value = value / 2) {
                sequence.append(value).append(" ");
            }
            
            rows[row] = sequence.toString().trim();
        }
        
        // Find the length of the longest row (bottom row)
        int maxLength = rows[numberOfRows - 1].length();
        
        // Fixed position where all "@" symbols will align 
        int atPosition = maxLength + 1;
        
        // Print each row
        for (int row = 0; row < numberOfRows; row++) {
            
            // Calculate spaces to center the numbers 
            int spacesToCenter = (maxLength - rows[row].length()) / 2;
            
            // Print leading spaces for centering
            for (int space = 0; space < spacesToCenter; space++) {
                System.out.print(" ");
            }
            
            // Print the numbers
            System.out.print(rows[row]);
            
            // Calculate spaces needed to reach the fixed "@" position
            int currentPosition = spacesToCenter + rows[row].length();
            int spacesNeeded = atPosition - currentPosition;
            
            // Add the spaces before "@"
            for (int space = 0; space < spacesNeeded; space++) {
                System.out.print(" ");
            }
            
            // Print "@" at the exact same column for every row
            System.out.println("@");
        }
        
        System.out.println("\nProgram complete.");
    }
}
   

