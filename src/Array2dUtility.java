
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] array) {
        int total = sum(array);
        int n = array.length;
        int count = n * n;
        return (double) total / count;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array) {
        int min = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] < min) {
                    min = array[row][col];
                }
            }
        }
        return min;
    }


    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array) {
        int max = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array) {
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array) {
        int count = 0;
        for (int[] row : array) {
            for (int value : row) {
                if (value % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }


    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                if (value <= 0) {
                    return false;
                }
            }
        }
        return true;
    }


    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array) {
        int[] result = new int[array.length];
        for (int row = 0; row < array.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < array[row].length; col++) {
                rowSum += array[row][col];
            }
            result[row] = rowSum;
        }
        return result;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array) {
        int cols = array[0].length;
        int[] result = new int[cols];
        for (int col = 0; col < cols; col++) {
            int colSum = 0;
            for (int row = 0; row < array.length; row++) {
                colSum += array[row][col];
            }
            result[col] = colSum;
        }
        return result;
    }

}
