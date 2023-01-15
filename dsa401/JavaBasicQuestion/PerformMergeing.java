// Perform Merging Ended
// Description

// You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

// Note: You must not use sort() function in your entire code

// Input
// Input Format :

// First line contains N which is the number of integers present in both the arrays.

// Second line contains N sorted integers which are elements of first array.

// Third line contains N sorted integers which are elements of second array.

// Constraints :

// N < 1000

// Output
// Output the array formed after merging elements such that it is sorted

// Sample Input 1 

// 4
// 1 5 7 9
// 2 4 6 8
// Sample Output 1

// 1 2 4 5 6 7 8 9

import java.util.Scanner;

public class PerformMergeing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArr = new int[n * 2];
        int i = 0, j = 0, k = 0;

        while (i < n && j < n) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < n) {
            mergedArr[k++] = arr2[j++];
        }

        for (int num : mergedArr) {
            System.out.print(num + " ");
        }
    }
}
