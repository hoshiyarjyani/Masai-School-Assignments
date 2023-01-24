// Sum of subarray Ended
// Description

// You are given an array of N integers and a single integer K. You need to find out if there is a subarray, which has the sum exactly as K.

// Input
// Input Format

// First-line contains T, no of test cases.

// First-line of each test case contains N, the size of the array, and K.

// Second-lineof each test casecontains N spaced integers, elements of an array.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^5

// 1 <= A[i] <= 10^12

// 1 <= K <= 10^12

// Output
// For each test case print "Yes", if there exists a subarray with sum K or else print "No".

// Sample Input 1 

// 3
// 5 3
// 1 2 1 3 4
// 4 5
// 1 2 1 3
// 3 2
// 1 2 1
// Sample Output 1

// Yes
// No
// Yes

import java.util.Scanner;

class Main {
    public static void Check(long[] arr, long n, long target) {
        long start = 0, end = 0, currentSum = (long) arr[0];
        boolean flag = false;
        while (end < n) {
            if (currentSum == target) {
                flag = true;
                break;
            }
            if (currentSum > target) {
                currentSum -= arr[(int) start];
                start++;
            } else {
                end++;
                if (end < n) {
                    currentSum += arr[(int) end];
                }
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tc = sc.nextLong();

        for (int i = 0; i < tc; i++) {
            long n = sc.nextLong();
            long target = sc.nextLong();
            long arr[] = new long[(int) n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Check(arr, n, target);
        }
    }
}