// Odd Sum in Columns -28:16:1
// Description

// You are given a 2D array, whose dimensions are stored in two variables with the nameNandM

// The value stored inNdenotes the number of rows, and the value inMdenotes the number of columns

// The 2D array is stored in a variable with the namearr

// For all columns, you have to print the sum of odd elements present in the column

// For example, consider the value stored inN = 3,M = 3, and the array isarr = [1,2,3],[4,5,6],[7,8,9], then the required output will be

// 8  (Odd numbers in the column are, [1,7]. Therefore, the sum becomes 8)
// 5  (Odd numbers in the column are, [5]. Therefore, the sum becomes 5) 
// 12 (Odd numbers in the row are, [3,9]. Therefore, the sum becomes 12)

// Input
// The first line of the input contains the value stored inNandM

// The nextNlines containMvalues each denoting the value stored inarr

// Output
// For each column, print the sum of odd numbers present in the column, line by line

// Sample Input 1 

// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1

// 8 
// 5 
// 12
// Hint

// In the sample test case, the value stored inN = 3,M = 3, and the array isarr = [1,2,3],[4,5,6],[7,8,9], then the required output will be

// 8  (Odd numbers in the column are, [1,7]. Therefore, the sum becomes 8)
// 5  (Odd numbers in the column are, [5]. Therefore, the sum becomes 5) 
// 12 (Odd numbers in the row are, [3,9]. Therefore, the sum becomes 12)
class Main {
    public static void oddSumInColumns(int n, int m, int[][] arr) {

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] % 2 == 1) {
                    sum += arr[j][i];
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}