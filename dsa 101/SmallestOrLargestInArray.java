// Smallest and Largest of all Ended
// Description

// Given an array,arrwhich hasNintegers.

// You need to print the smallest and largest element present in the array each on new lines.

// Input
// Input Format

// The first line contains an integerN.

// The second line containsNspace separated integers, which are integers of arrayarr.

// Constraints

// 1 <= N <= 100

// Output
// Output Format

// One first line, print minimum of all elements.

// On the second line, print the maximum of all elements.

// Sample Input 1 

// 4
// -2 0 8 4
// Sample Output 1

// -2
// 8
// Hint

// Integers in array are:-[-2, 0, 8, 4]

// Minimum integer in array[-2, 0, 8, 4]is-2

// Maximum integer in array[-2, 0, 8, 4]is-8

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n - 1]);

    }
}