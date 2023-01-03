// Equilibrium Element Ended
// Description

// Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

// Input
// Input Format

// First line contains an integer N denoting the size of the array.

// Then in the next line are N space separated values of the array A.

// N <= 1000

// Ai <= 10000

// Output
// In a new line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.

// Sample Input 1 

// 5
// 3 3 5 5 1
// Sample Output 1

// 3

import java.util.Scanner;

public class EquilibriumElement {

    static int myFun(int[] arr, int n) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {

            if (sum1 > sum2) {
                j--;
                sum2 += arr[j];
            } else if (sum1 < sum2) {
                i++;
                sum1 += arr[i];

            } else {
                if (j - i < 3) {
                    return j - i + 1;
                } else {
                    sum1 += arr[i];
                    sum2 += arr[j];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = myFun(arr, tc);
        System.out.println(ans);
    }
}
