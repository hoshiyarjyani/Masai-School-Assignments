// Matrix Prime Check -29:47:29
// Description

// In this question, you are given a 2D array stored in a variable with the namearr

// The number of rows in the matrix is stored in the variable with the nameN, while the number of columns stored in the matrix is stored in a variable with the nameM

// You have to find and print the count of prime numbers present in the matrix

// For example, consider the value stored inN = 3, andM = 3, and

// N = 3 M = 3

// arr = [[1 2 3]
//        [4 5 6]
//        [7 8 9]]
// The prime numbers in the 2D array are2,3,5,7. Therefore, the required output is 4

// Note : The 2D array may contain duplicate elements. Each instance of a prime number should be counted separately

// Input
// The first line of the input contains the values stored inNandM

// The next line contains the values stored inarr

// Output
// Print the count of prime numbers present in the matrix

// Sample Input 1 

// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
// Sample Output 1

// 4
// Hint

// In the sample test case, the value stored inN = 3, andM = 3, and

// N = 3 M = 3

// arr = [[1 2 3]
//        [4 5 6]
//        [7 8 9]]
// The prime numbers in the 2D array are2,3,5,7. Therefore, the required output is 4

import java.util.Scanner;

public class Main {
    public static int primeCount(int[][] arr, int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(arr[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int count = primeCount(arr, n, m);
        System.out.println(count);
    }
}
