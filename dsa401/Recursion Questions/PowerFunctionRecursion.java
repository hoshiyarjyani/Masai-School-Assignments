// Power Function - Recursive
// Description

// Given two integers a and b, we need to find the value of a^b recursively.

// Expected Time Complexity - O(logb).

// Input
// The first line of the input contains two integers a and b (1 ≤ a ≤ 10) and (0 ≤ b ≤ 9).

// Output
// For each test case, print the answer: The value of a^b.

// Sample Input 1 

// 2 4
// Sample Output 1

// 16

import java.util.Scanner;

class PowerFunctionRecursion {
    static int myFun(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * myFun(n, p - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = myFun(n, p);
        System.out.println(res);
    }
}