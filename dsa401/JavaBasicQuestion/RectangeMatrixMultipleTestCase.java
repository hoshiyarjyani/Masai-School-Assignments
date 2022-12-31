package JavaBasicQuestion;

import java.util.Scanner;

public class RectangeMatrixMultipleTestCase {

    static void myfun(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int k = 0; k < tc; k++) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            myfun(matrix, row, col);
        }
    }

}

// Rectangular Matrix - Multiple Test Cases
// Description

// Rectangular Matrix - Multiple Test Cases

// Input
// The first line of the input containsT, the number of test cases

// The first line of each test case containsN, andMthe dimension of the matrix

// The nextNlines containMelements each denoting the elements of the matrix

// Output
// For each test case, print the elements of the matrix row by row by adding 1
// to each element, as shown in the sample test case

// Sample Input 1

// 2
// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 2 3
// 1 2 3
// 4 5 6
// Sample Output 1

// 2 3 4 5
// 6 7 8 9
// 10 11 12 13
// 2 3 4
// 5 6 7