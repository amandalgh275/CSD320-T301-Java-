/*
 * Name: Amanda Tiery
 * Date: March 16, 2026
 * Assignment: Module 1 - Integer vs Floating Point Arithmetic
 * 
 * Purpose: This program demonstrates the difference between integer division
 * and floating-point division in Java by calculating the same mathematical
 * expression both ways.
 */

package module1;

public class Module1 {

    public static void main(String[] args) {
        
        // Calculate using floating-point numbers (with .0)
        // This uses double values, so division retains decimal places
        double floatingResult = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0);
        
        // Calculate using integers (without .0)
        // This uses integer division, which truncates decimal places
        int integerResult = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
        
        // Display both results
        System.out.println("Floating-point result: " + floatingResult);
        System.out.println("Integer result: " + integerResult);
        
        // Discussion of the difference
System.out.println("\n--- Discussion ---");
System.out.println("The first result (using decimals) comes out to about 3.28,");
System.out.println("which is close to the mathematical constant pi.");
System.out.println("The second result is 4 because Java treats numbers without");
System.out.println("decimals as integers. When you do division like 1/3 with");
System.out.println("integers, Java drops everything after the decimal point.");
System.out.println("So 1/3 becomes 0, 1/5 becomes 0, and so on.");
System.out.println("That leaves just 4 x 1, which equals 4.");
System.out.println("\nThe decimal version is more accurate for math calculations.");
System.out.println("The integer version shows why programmers need to be careful");
System.out.println("about data types when doing division.");
    }
}
