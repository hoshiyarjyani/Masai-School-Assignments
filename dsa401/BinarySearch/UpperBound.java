// Upper Bound in LogN Ended
// Description

// You are given n different numbers and an integer k. Write a program that finds upper bound of k in log(n) time complexity. Upper bound of a number k in a sorted list is the index of the first number which is greater than k (here the answer is given considering index to be starting from 0)

// -> Test cases are such that there is always one number greater than k

// NOTE: YOU MUST NOT USE BRUTE FORCE SOLUTION

// WE KNOW THAT YOU KNOW BRUTE FORCE SOLUTION AND WANT YOU TRY THE LOGN SOLUTION

// USING BRUTE FORCE/LINEAR SEARCH, IN THIS CASE, WOULD LEAD TO DISQUALIFICATION

// Input
// Input Format

// First line contains N and K

// Second line contains N space separated sorted integers

// Constraints

// N<100

// Output
// Output upper bound

// Sample Input 1 

// 10 3
// 0 2 4 4 5 5 7 7 9 10
// Sample Output 1

// 2
// Sample Input 2 

// 10 4
// 0 2 4 4 5 5 7 7 9 10
// Sample Output 2

// 4
package BinarySearch;

import java.util.Scanner;

public class UpperBound {

    static int upperBound(int[] arr, int low, int high, int k) {
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = upperBound(arr, 0, n - 1, k);
        System.out.println(result);
    }
}
