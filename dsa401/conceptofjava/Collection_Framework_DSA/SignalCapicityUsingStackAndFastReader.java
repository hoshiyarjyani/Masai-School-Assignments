// Signal's Capacity -13:28:41
// Description

// There are many signal towers present in Bangalore.Towers are aligned in a straight horizontal line(from left to right) and each tower transmits a signal in the right to left direction.

// Tower X shall block the signal of Tower Y if Tower X is present to the left of Tower Y and Tower X is taller than Tower Y. So,the power of a signal of a given tower can be defined as :

// {(the number of contiguous towers just to the left of the given tower whose height is less than or equal to the height of the given tower) + 1}.

// You need to write a program that finds the power of each tower.

// Input
// Input Format

// Each test case has multiple test cases in it:

// First line contains an integer specifying the number of test cases.

// Second line contains an integer n specifying the number of towers.

// Third line contains n space separated integers(H[i]) denoting the height of each tower.

// Constraints

// 1 <= T <= 10

// 2 <= n <= 10^6

// 1 <= H[i] <= 10^8

// Output
// Output Format

// Print the range of each tower (separated by a space).

// Sample Input 1 

// 2
// 7
// 100 80 60 70 60 75 85
// 5
// 3 5 0 9 8
// Sample Output 1

// 1 1 1 2 1 4 6
// 1 2 1 4 1
// Hint

// Sample 1 Explanation

// There are 2 test case:

// In first test case:

// 7 towers are present, and signal range of each tower separated by space:1 1 1 2 1 4 6

// Similarly,

// In second test case, we have 5 towers whose signal range is given

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();

            }
            return str;
        }
    }

    public static void main(String[] args) {
        // This will take the input
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            myFun(n, arr);
        }

    }

    public static void myFun(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                sb.append(i + 1 + " ");
            } else {
                sb.append(i - stack.peek() + " ");
            }
            stack.push(i);
        }
        System.out.println(sb.toString());
    }

}
