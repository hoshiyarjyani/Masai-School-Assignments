// Detect Palindrome -19:35:4
// Description

// Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)

// You must write a recursive function to achieve this

// You must not use the reverse() function. Using that would lead to disqualification

// Input
// Input Format

// You are provided with one integer.

// Constraints

// The provided integer is always lesser than 1000000

// Output
// Print Yes or No depending upon the integer.

// Sample Input 1 

// 1221
// Sample Output 1

// Yes
// Hint

// Sample 1 Explanation

// Reading 1221 from either side is same, so Yes, it is a palindrome.

// Language: 

// Theme: 
// Font Size: 10

//   
//    Test against custom input
// Status  Accepted

package JavaBasicQuestion;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                continue;

            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}