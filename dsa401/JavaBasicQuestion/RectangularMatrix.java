package JavaBasicQuestion;

import java.util.Scanner;

public class RectangularMatrix {

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

// Rectangular Matrix
// Description

// Rectangular Matrix - Single Test Case

// Input
// The first line of the input containsNandM, the dimensions of the matrix

// The nextNline containsMspace separated integers, denoting the elements of the
// matrix

// Output
// Print the elements of the matrix, row by row, by adding 1 to each element, as
// shown in the sample input

// Sample Input 1

// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// Sample Output 1

// 2 3 4 5
// 6 7 8 9
// 10 11 12 13