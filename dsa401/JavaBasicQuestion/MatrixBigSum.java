package JavaBasicQuestion;

import java.util.Scanner;

public class MatrixBigSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += sc.nextInt();
            }
        }
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int sum1 = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum1 += sc.nextInt();
            }
        }
        if (sum1 > sum) {
            System.out.println(sum1);
        } else {
            System.out.println(sum);
        }

    }
}

// Matrix Competition -19:13:9
// Description

// You are given two matrices (2D array). The first array A (n rows and m
// columns) and second array B (i rows and j columns).

// Output sum of the matrix which is greater than the sum of other matrix.

// PLEASE DON'T CONVERT YOUR 2D ARRAY TO 1D ARRAY FOR THIS TASK** because this
// question is to make you comfortable in 2d array

// Input
// Input Format

// First line contains n and m (number of rows and columns of first matrix).

// Next n lines contain m elements which are elements of first matrix.

// Next line contains i and j (number of rows and columns of second matrix).

// Next, i lines contain j elements which are elements of the second matrix.

// Constraints

// n<100

// m<100

// i<100

// j<100

// Output
// Output one number, which is the sum of elements of that matrix whose sum is
// greater than other.

// Sample Input 1

// 3 4
// 1 2 3 4
// 0 5 6 1
// 9 3 0 8
// 2 2
// 8 8
// 8 8
// Sample Output 1

// 42
// Hint

// Sample 1 Explanation

// Sum of elements present in the first matrix is 42 and the sum of elements
// present in the second matrix is 32.

// So, the answer is 42
