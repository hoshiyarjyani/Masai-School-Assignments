// Equilibrium Element -51:7:43
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
import java.util.HashSet;

public class EqulibriumElementinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        boolean flag = false;

        for (int i = 0; i < N; i++) {
            int k = i;
            while (k >= 0) {
                sum1 += arr[k];
                k--;
            }
            int m = i;
            while (m < N) {
                sum2 += arr[m];
                m++;
            }
            if (sum1 == sum2) {
                flag = true;
                System.out.println(i + 1);
                break;
            }
            sum1 = 0;
            sum2 = 0;
        }
        if (!flag) {
            System.out.println(-1);
        }

    }
}
