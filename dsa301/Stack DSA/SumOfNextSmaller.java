// Sum of next smaller Ended
// Description

// Given an array of integers, find the sum of the nearest smaller values to the right of all the elements, if such values dont exist, consider them zero.

// Input
// First-line contains T, no of test cases.

// First-line of each test case contains n which is the number of elements in the array

// Second-lineof each test casecontains n numbers representing elements of the array

// Constraints

// 1 <= T <= 10

// 1<=N<=100000

// 1<=Ai<=100

// Output
// For each test case, output a single integer, the answer to the problem, on new line

// Sample Input 1 

// 2
// 4
// 4 3 1 2
// 4
// 1 2 3 4
// Sample Output 1

// 4
// 0
// Hint

// For 1st test case:-

// For 4 first smaller value to the right is  3.

// For 3 first smaller value to the right is 1.

// For 1 first smaller value to the right is not there.

// For 2 first smaller value to the rightis not there.

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static void myFunction(int[] arr, int n) {
        int sum = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stk.empty() && stk.peek() >= arr[i]) {
                stk.pop();
            }
            if (stk.empty()) {
                sum += 0;
            } else {
                sum += stk.peek();
            }
            stk.push(arr[i]);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            myFunction(arr, n);
        }
        sc.close();
    }
}
