// Detect Palindrome -52:47:43
// Description

// You are given a integernum.

// You need to printYesif that integer is a palindrome or else printNo.

// A palindrome is a word, number, phrase, or other sequence of characters that reads the same backward as forward, such asmadamorracecar.

// Input
// Input Format

// First line containsnum, a integer.

// Constraints

// 1 <= num <= 1000000

// Output
// PrintYesorNodepending upon the integer.

// Sample Input 1 

// 1221
// Sample Output 1

// Yes
// Hint

// Sample 1 Explanation

// We printYesas1221`is a palindrome.

// Language: 

// Theme: 
// Font Size: 10

//   
//    Test against custom input
// Status  Accepted
// Masai School

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] arr = n.toCharArray();
        boolean palindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}