// Number of Occurences in logn -67:15:19
// Description

// You are given n different numbers and an integer k. Write a program that finds number of times k is present in log(n) time complexity.

// NOTE: YOU MUST NOT USE BRUTE FORCE SOLUTION

// WE KNOW THAT YOU KNOW BRUTE FORCE SOLUTION AND WANT YOU TRY THE LOGN SOLUTION

// USING BRUTE FORCE/LINEAR SEARCH IN THIS CASE WOULD LEAD TO DISQUALIFICATION

// Input
// Input Format :

// First line contains N and K

// Second line contains N space separated sorted integers

// Constraints :

// N<100

// Output
// Print number of times that number is present in the given list

// Sample Input 1 

// 6 3
// 2 3 3 3 6 9
// Sample Output 1

// 3
package BinarySearch;

import java.util.Scanner;

public class NumberOfOccerence {

    public static int search(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < k) {
                left = mid + 1;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                count++;
                int i = mid - 1;
                int j = mid + 1;
                while (i >= 0 && arr[i] == k) {
                    count++;
                    i--;
                }
                while (j < arr.length && arr[j] == k) {
                    count++;
                    j++;
                }
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = search(arr, k);
        System.out.println(count);
    }
}
