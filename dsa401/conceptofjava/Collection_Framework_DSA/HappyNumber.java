// Is it Happy? 
// Description

// A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or itloops endlessly in a cyclewhich does not include 1. Those numbers for which this processends in 1are happy numbers.

// Return True ifnis a happy number, and False if not.

// Input
// 1<=T<=1000

// next t lines consist of an integer N

// 1<=N<=1e9

// Output
// true if it is happy else false

// description for 19,

// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

// Sample Input 1 

// 3
// 19
// 2
// 312082396
// Sample Output 1

// true
// false
// true

import java.util.*;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(isHappy(n));
        }
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int next = 0;
            while (n > 0) {
                int digit = n % 10;
                next += digit * digit;
                n /= 10;
            }
            n = next;
        }
        return n == 1;
    }
}
