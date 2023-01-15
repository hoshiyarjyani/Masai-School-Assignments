// Intersection of Array Ended
// Description

// You are given 2 arraysarr1andarr2ofNintegers.

// Your task is to write a program that finds the one integer which is common in both arrays (arr1andarr2).

// Note: There is always one integer common in both arrays.

// Input
// Input Format

// First line of input containsN, size of arrays.

// Second line containsNspace separated integers making the first array (arr1)

// Third line containsNspace separated integers making the second array (arr2)

// Constraints

// 1 <= N <= 1000

// Output
// Output Format

// Output that one integer which is common in both arrays

// Sample Input 1 

// 3
// 4 5 7
// 9 2 5
// Sample Output 1

// 5
// Hint

// arr1 is 4 5 7.

// arr2 is 9 2 5.

// 5 is common in both array, so we print 5.

import java.util.Scanner;
import java.util.HashSet;

public class CommonElementInTwoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            if (set1.contains(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
