// Reverse N Traversal 
// Description

// You are given a matrix of size n x n. Find the ReverseNtraversal of the matrix. Refer the following figure for better understanding.

// Image

// Input
// The first line contains T, the number of test cases. The first line of each test case contains N, the size of the square matrix.

// Next N lines contain N space separated integers, denoting the values of the matrix.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 500

// 1 <= A[i][j] <= 1000

// Output
// For each test case, print the N traversal of the matrix on a single line, on a new line.

// Sample Input 1 

// 1
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1

// 1 4 7 5 3 6 9 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tc = sc.nextInt();

        while (Tc-- > 0) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0 || i == N - 1) {
                        System.out.print(matrix[j][i] + " ");
                    } else if (i + j == N - 1) {
                        System.out.print(matrix[j][i] + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
