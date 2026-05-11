// Name:        Amanda Tirey
// Date:        May 10, 2026
// Assignment:  Module 8 - Method Overloading (Yearly Auto Service Cost)
// Purpose:     Demonstrates method overloading by calculating auto service costs with varying fees and a coupon.

package module8;

public class Module8 {

    // Standard service charge that applies to every visit
    private static final double STANDARD_CHARGE = 100.0;

    // Method 1: No parameters – returns only the standard charge
    public static double yearlyService() {
        return STANDARD_CHARGE;
    }

    // Method 2: One parameter – adds an oil change fee to the standard charge
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_CHARGE + oilChangeFee;
    }

    // Method 3: Two parameters – adds oil change and tire rotation fees
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return STANDARD_CHARGE + oilChangeFee + tireRotationFee;
    }

    // Method 4: Three parameters – adds oil change and tire rotation fees, then subtracts a coupon amount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount) {
        return STANDARD_CHARGE + oilChangeFee + tireRotationFee - couponAmount;
    }

    // Main method to test all four overloaded methods twice each
    public static void main(String[] args) {

        // Display assignment header
        System.out.println("Amanda Tirey – Module 8 Assignment\n");

        // Test yearlyService() – no parameters
        System.out.println("Test 1 (no parameters): $" + yearlyService());
        System.out.println("Test 2 (no parameters): $" + yearlyService());

        // Blank line separates sections
        System.out.println();

        // Test yearlyService(one parameter) – oil change only
        System.out.println("Test 1 (oil change $30): $" + yearlyService(30.0));
        System.out.println("Test 2 (oil change $45): $" + yearlyService(45.0));

        System.out.println();

        // Test yearlyService(two parameters) – oil change + tire rotation
        System.out.println("Test 1 (oil $30, tire $25): $" + yearlyService(30.0, 25.0));
        System.out.println("Test 2 (oil $40, tire $20): $" + yearlyService(40.0, 20.0));

        System.out.println();

        // Test yearlyService(three parameters) – oil + tire – coupon
        System.out.println("Test 1 (oil $30, tire $20, coupon $15): $" + yearlyService(30.0, 20.0, 15.0));
        System.out.println("Test 2 (oil $45, tire $25, coupon $10): $" + yearlyService(45.0, 25.0, 10.0));
    }
}