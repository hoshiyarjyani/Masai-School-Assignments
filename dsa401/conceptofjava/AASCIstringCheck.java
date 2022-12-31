package conceptofjava;

import java.util.Scanner;
// alphanumeric = af67dh
// chars        = toys
// numbers      = 54646
public class AASCIstringCheck {

    static void myfun(String str, int n) {
        int eng = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            int asciiCode = (int) c;
            if (asciiCode >= 48 && asciiCode <= 57) {
                num++;
            } else {
                eng++;
            }
        }
        if (eng > 0 && num > 0) {
            System.out.println("alphanumeric");
        } else if (eng > 0) {
            System.out.println("chars");
        } else {
            System.out.println("numbers");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            String str = sc.next();
            myfun(str, n);
        }
    }
}

// String Check Ended
// Description

// Given a string, check whether it contains only characters, only numbers or
// both.

// If it contains only characters, output "chars" without quotes

// If it contains only numbers, output "numbers" without quotes

// If it contains both numbers and characters, output "alphanumeric" without
// quotes

// Input
// Input
// The first line of input will contain an integer T, denoting the number of
// test cases.

// The first line of each test case will contain an integer N, denoting the size
// of the string.

// The next line will contain the string of N size.

// Constraints
// 1<=T<=10

// 1<=N<=10^5

// Output
// For each test case output string as mentioned in the description, in a new
// line.

// Sample Input 1

// 3
// 5
// ab2cd
// 5
// acfgh
// 3
// 123
// Sample Output 1

// alphanumeric
// chars
// numbers
// Hint

// In Sample 1
// T = 3

// String 1: It contains both characters and numbers so the output is
// alphanumeric

// String 2: It contains only characters so the output will be chars

// String 3: It contains only numbers so the output is numbers

// Language:

// Theme:
// Font Size: 14

//
// Test against custom input
// Status Accepted
