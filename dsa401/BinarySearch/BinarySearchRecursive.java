// Binary Search - Recursive Ended
// Description

// Given n distinct numbers, implement a recursive binary search to check the presence of target number k.

// In case k is present among those n numbers, print 1

// Else print -1

// Input
// Input Format :

// First line of input contains n and k separated by a space

// Next line contains n space separated integers

// Constraints:

// n<1000

// Output
// In casekis present among those n numbers, print 1

// Else print -1

// Sample Input 1 

// 5 0
// 2 -2 0 3 4
// Sample Output 1

// 1

package BinarySearch;

import java.util.Scanner;

public class BinarySearchRecursive {

    static int binarySearchRecursive(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return 1;
            } else if (arr[mid] > k) {
                return binarySearchRecursive(arr, low, mid - 1, k);
            } else {
                return binarySearchRecursive(arr, mid + 1, high, k);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binarySearchRecursive(arr, 0, n - 1, k);
        System.out.println(result);
    }
}
