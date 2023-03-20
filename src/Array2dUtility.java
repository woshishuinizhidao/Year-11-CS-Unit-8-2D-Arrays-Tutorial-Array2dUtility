import java.util.*;
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++)
                System.out.print(integers[i][j] + " ");
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++)
                sum += integers[i][j];
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] integers) {
        int sum = sum(integers);
        int num = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++)
                num++;
        }
        return (double) sum / num;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] integers) {
        int min = integers[0][0];
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                if(min > integers[i][j]){
                    min = integers[i][j];
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] integers) {
        int max = 0;
        for (int i = 0; i < integers.length; i++) {
            max = integers[i][0];
            for (int j = 0; j < integers[i].length; j++) {
                max = (integers[i][j] > max) ? integers[i][j] : max;
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] integers) {
        int evenCount = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] integers) {
        int evenCount = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] integers) {
        boolean ifPositive = true;
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] < 0) {
                    ifPositive = false;
                }
            }
        }
        return ifPositive;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        int rowNum = 0;
        for (int[] row : arr2D) {
            sums[rowNum] = arraySum(row);
            rowNum++;
        }
        return sums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] integers) {
        int numRows = integers.length;
        int numCols = integers[0].length;
        int[] colSum = new int[numCols];
        // Loop through the given number of columns
        for(int i = 0; i < numCols; i++)
        {
            // define the sum variable to get the column sum
            int sum = 0;

            // Loop through the elements in the column
            for(int j = 0; j < numRows; j++)
                // add every element to the sum variable
                sum += integers[j][i];
            // add the column sum to the result array
            colSum[i] = sum;
        }
        return colSum;
    }

}
