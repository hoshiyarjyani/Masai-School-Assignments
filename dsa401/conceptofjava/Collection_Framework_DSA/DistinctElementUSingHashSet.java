// Distinct Again -51:18:13
// Description

// You are given an array of N elements. Your task is to write a program that calculates the sum of all distinct elements present in the array.

// Input
// Input Format

// First line of input contains N

// Second line of input contains N space separated integers.

// Constraints

// N<10000

// Output
// Output Format

// Output sum of only distinct elements

// Sample Input 1 

// 5
// 2 2 2 1 1
// Sample Output 1

// 3
// Hint

// Sample 1 Explanation

// There are 5 elements present in the array but only 2 distinct elements (2 and 1)

// Hence, sum is 3

// Language: 

import java.util.Scanner;
import java.util.HashSet;

public class DistinctElementUSingHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        for (int num : set) {
            sum += num;
        }
        System.out.println(sum);
    }
}
