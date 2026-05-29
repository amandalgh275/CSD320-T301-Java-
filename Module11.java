/**
 * Name: Amanda Tirey
 * Date: 5/29/2026
 * Module 11: Location of Largest and Smallest in 2D Arrays
 * Purpose: Provide overloaded methods to find the location (row, column) of the
 *          largest and smallest elements in both double and int 2D arrays.
 */

package module11;

import java.util.Arrays;

public class Module11 {

    public static int[] locateLargest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) return new int[]{-1, -1};
        int row = 0, col = 0;
        double max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateLargest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) return new int[]{-1, -1};
        int row = 0, col = 0;
        int max = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) return new int[]{-1, -1};
        int row = 0, col = 0;
        double min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0) return new int[]{-1, -1};
        int row = 0, col = 0;
        int min = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        double[][] doubleMatrix = {
            {5.2, 3.1, 8.9},
            {2.4, 7.6, 4.3},
            {9.8, 1.5, 6.7}
        };

        int[][] intMatrix = {
            {14, 27, 33},
            {22, 41, 19},
            {35, 28, 30}
        };

        System.out.println("=== Double 2D Array ===");
        for (double[] row : doubleMatrix) {
            System.out.println(Arrays.toString(row));
        }
        int[] largestDouble = locateLargest(doubleMatrix);
        int[] smallestDouble = locateSmallest(doubleMatrix);
        System.out.println("Largest at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")\n");

        System.out.println("=== Int 2D Array ===");
        for (int[] row : intMatrix) {
            System.out.println(Arrays.toString(row));
        }
        int[] largestInt = locateLargest(intMatrix);
        int[] smallestInt = locateSmallest(intMatrix);
        System.out.println("Largest at: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }
}