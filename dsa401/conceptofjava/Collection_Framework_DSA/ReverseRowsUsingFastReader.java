// Reverse Rows Ended
// Description

// You will be given an n by n matrix. You'll have to reverse the elements of each row of the matrix

// Input
// Input Format

// First line will contain the number of rows n (same as the number of columns)

// After that next n lines will n rows of the matrix.

// Constraints

// n<=1000

// Elements Of the Matrix <= 10000

// Output
// You have to print the flipped matrix

// Sample Input 1 

// 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// Sample Output 1

// 4 3 2 1
// 4 3 2 1
// 4 3 2 1
// 4 3 2 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();

            }
            return str;
        }
    }

    public static void main(String[] args) {
        // This will take the input
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Reverse the elements of each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        // Print the flipped matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
