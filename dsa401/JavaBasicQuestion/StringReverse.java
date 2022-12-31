package JavaBasicQuestion;

import java.util.Scanner;

public class StringReverse {

    static void myfun(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            str1 += str.charAt(i);
        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        myfun(str);
    }
}

// Masai String Reversal Ended
// Description

// You are given a string S. Print the reversed version of the string.

// Input
// Input Format

// The first and only line contains string S.

// Constraints

// Length of string < 100

// Output
// Reverse the provided string and output it.

// Sample Input 1

// masaischool
// Sample Output 1

// loohcsiasam