// Next Greater Odd Ended
// Description

// Given an array of N integers, Find the next greater element for each element in the array and if the next greater element does not exist take it as -1, You need
// to output the sum of numbers for which the next greater elements are odd and positive.

// Note: Do not consider -1 as odd number.

// Input
// Input Format:

// The first line contains T, the number of test cases.

// The first line of each test case contains N, the number of elements in the array.

// The next line contains N space separated integers denoting the elements of the array

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^5

// 0 <= A[i] <= 1005

// Output
// For each test case output the sum as mentioned in the problem in a new line.

// Sample Input 1 

// 1
// 5
// 2 3 5 8 3
// Sample Output 1

// 5
// Hint

// In Sample 1:

// N = 5

// Array : 2 3 5 8 3

// Next Greater Elements for each elements are as:

// 2 -> 3

// 3 -> 5

// 5 -> 8

// 8 -> -1

// 3 -> -1

// Numbers whose next greater elements are odd : 2, 3 , and we need to output the sum of all such numbers whose next greater number is odd, so output will be 2+3 = 5

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Result Array
            int[] res = new int[n];

            // Stack
            Stack<Integer> stk = new Stack<>();
            int count = 0;
            for (int i = n - 1; i >= 0; i--) {
                while (!stk.empty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }
                if (stk.empty()) {
                    res[i] = 0;
                } else {
                    res[i] = stk.peek();
                }
                stk.push(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                if (res[i] % 2 == 1) {
                    count += arr[i];
                }
            }
            System.out.println(count);

        }
    }
}