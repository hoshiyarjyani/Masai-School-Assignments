// Valid Stack Sequence Ended
// Description

// Given two integer arrays pushed and popped each with distinct values, print "YES" if this could have been the result of a sequence of push and pop operations on an initially empty stack, or "NO" otherwise.

// Input
// Input Format

// The first line contains the number of testcases - t

// For each testcase:

// The first line contains the number of values - n
// The second line contains the pushed array
// The third line contains the popped array
// Constraints

// 1<=t<=10

// 1<=n<=10^5

// All elements of pushed and popped are distinct

// Output
// Print "YES" if this could have been the result of a sequence of push and pop operations on an initially empty stack, or "NO" otherwise.

// Sample Input 1 

// 2
// 5
// 1 2 3 4 5
// 4 5 3 2 1
// 5
// 1 2 3 4 5
// 4 3 5 1 2
// Sample Output 1

// YES
// NO
// Hint

// Explanation 1 : We might do the following sequence:

// push(1), push(2), push(3), push(4),
// pop() -> 4,
// push(5),
// pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
// Explanation 2 : 1 cannot be popped before 2.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {

            int n = sc.nextInt();
            int[] pushed = new int[n];
            int[] poped = new int[n];
            for (int i = 0; i < n; i++) {
                pushed[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                poped[i] = sc.nextInt();
            }

            Stack<Integer> stk = new Stack<>();

            int i = 0;
            int j = 0;
            while (i < n) {
                stk.push(pushed[i++]);
                while (!stk.empty() && stk.peek() == poped[j]) {
                    stk.pop();
                    j++;
                }

            }
            if (stk.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}