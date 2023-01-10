package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean flag = false;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;
        while (start < end) {
            if (k == arr[start]) {
                flag = true;
                break;
            }
            if (k == arr[end]) {
                flag = true;
                break;
            }
            if (k < arr[mid]) {
                start = 0;
                end = mid;
                mid = (start + end) / 2;
            } else if (k > arr[mid]) {
                start = mid;
                end = n - 1;
                mid = (start + end) / 2;
            } else {
                flag = true;
                break;
            }

        }
        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }

}

// Binary Search - Iterative Ended
// Description

// Given n distinct numbers, implement iterative binary search to check the
// presence of target number k.

// In case k is present among those n numbers, print 1

// Else print -1

// Input
// Input Format :

// First line of input contains n and k separated by a space

// Next line contains n space separated integers

// Constraints :

// n<1000

// Output
// In case k is present among those n numbers, print 1

// Else print -1

// Sample Input 1

// 5 0
// 2 -2 0 3 4
// Sample Output 1

// 1