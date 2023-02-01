// Borderless Ended
// Description

// You are given a matrix A of size N X M. Find the sum of all the elements in the matrix which do not lie at the border.

// Input
// The first line of the input contains N and M, denoting the dimensions of the matrix.

// The next N lines contain M space separated integers each, denoting the elements of the matrix.

// Constraints

// 1 <= N, M <= 100

// 1 <= A[i][j] <= 100

// Output
// Print a single integer denoting the sum of all the elements in the matrix, which do not lie at the border.

// Sample Input 1 

// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Sample Output 1

// 34
// Hint

// In the sample test case, the elements which do not lie at the border, are {6,7,10,11}. Therefore, the sum of the elements are => 6 + 7 + 10 + 11 = 34, which is the required answer.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    continue;
                } else {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}