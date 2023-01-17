// String Difference Problem -54:5:7
// Description

// You are given two strings S1 and S2. You have to find the difference when S2 is subtracted from S1 (S1-S2)

// (Sx-Sy) results in character which are extra in Sx (in the same order it is present in Sx and not in Sy)

// Input
// Input Format:

// First line of the input contains S1

// Second line of input contains S2

// Constraints:

// Length of both strings <= 1000

// Output
// Output the difference between the 2 strings

// Sample Input 1 

// ABCX
// ABCD
// Sample Output 1

// X
import java.util.Scanner;

public class StringCharDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println(c1[i]);
                break;
            }
        }
    }
}
