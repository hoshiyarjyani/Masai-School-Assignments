package JavaBasicQuestion;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
// Reverse Array 12 -19:28:25
// Description

// You are given an array A of length n. Your task is to write a program that
// prints the array in reversed form.

// Input
// Input Format

// First line contains n (number of elements present in the array)

// Second line contains n space separated integers which are the elements of the
// array.

// Constraints

// n< 100

// Output
// Output the elements of the array in the reversed form (separated by space)

// Read sample test case explanation for better understanding

// Sample Input 1

// 5
// 12 34 11 9 18
// Sample Output 1

// 18 9 11 34 12