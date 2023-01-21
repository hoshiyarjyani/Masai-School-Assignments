// Beautiful Permutations Ended
// Description

// Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:

// perm[i] is divisible by i.
// i is divisible by perm[i].
// Given an integer n, print the number of the beautiful arrangements that you can construct.

// Input
// Input Format

// The first and only line contains the integer n

// Constraints

// 1<=n<=15

// Output
// Print the number of the beautiful arrangements that you can construct.

// Sample Input 1 

// 2
// Sample Output 1

// 2
// Hint

// The permutations are {1,2},{2,1}

import java.util.*;

class Main {
    static int n;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i + 1;
        }
        genratePerm(perm, 0);
        System.out.println(count);
    }

    public static void genratePerm(int[] perm, int start) {
        if (start == n) {
            if (isBeautiful(perm)) {
                count++;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            swap(perm, start, i);
            genratePerm(perm, start + 1);
            swap(perm, start, i);
        }
    }

    public static boolean isBeautiful(int[] perm) {
        for (int i = 0; i < n; i++) {
            if (perm[i] % (i + 1) != 0 && (i + 1) % perm[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] perm, int i, int j) {
        int temp = perm[i];
        perm[i] = perm[j];
        perm[j] = temp;
    }

}