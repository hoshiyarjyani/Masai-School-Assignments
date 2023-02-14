// Sum it over  
// Description

// Your boss has given you a number s and asked you to return the minimum number x such that the sum of the digits of x is s.

// Also all the digits in x should be distinct.

// Input
// Input Format
// The first line contains an integer t - the number of testcases.

// The next t lines contains the description of the t testcases.

// The first and the only line of each testcase contains an integer s.

// Constraints
// 1 ≤ t ≤ 45

// 1 ≤ s ≤ 45

// Output
// Output Format
// Print t integers — the answers to the given test cases.

// Sample Input 1 

// 4
// 20
// 8
// 45
// 10
// Sample Output 1

// 389
// 8
// 123456789
// 19
// Hint

// For example, if s=20, then the answer is 389. This is the minimum number in which all digits are different and the sum of the digits is 20 (3+8+9=20).

import java.util.*;

class SumItOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int sum = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 9; i >= 1; i--) {
                if (sum >= i) {
                    sb.append(i);
                    sum -= i;
                }
            }
            System.out.println(sb.reverse());
        }
    }
}