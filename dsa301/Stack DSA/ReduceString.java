// Reduce String Ended
// Description

// Given a string of lowercase characters in range ascii[‘a’..’z’].

// You can perform one operation on this string in which you can selects a pair of adjacent lowercase letters that match, and delete them.

// For instance, the string aab could be shortened to b in one operation.

// Your task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print "Empty String" (without quotes).

// Please note that characters can be deleted only if they form a pair and are same(i.e from aaa we can only delete 2 a's and will be left with a single a).

// I know there exists a simple implemented Stringentation based solution of this question, but please try to come up with an approach that uses stack data structure to solve the purpose

// Input
// Input Format

// First and the only line contains string

// Constraints

// Length of string < 1000

// Output
// Output Format

// If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

// Sample Input 1 

// aaabccddd
// Sample Output 1

// abd
// Hint

// Sample 1 Explanation

// You can perform the following sequence of operations to get the final string:

// aaabccddd -> abccddd -> abddd -> abd

// Language: 

// Theme: 
// Font Size: 12

//    Test against custom input
// Status  Accepted

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stk = new Stack<>();
        // aaabccddd
        for (int i = 0; i < str.length(); i++) {
            if (!stk.empty() && stk.peek() == str.charAt(i)) {
                stk.pop();
            } else {
                stk.push(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stk) {
            sb.append(c);
        }

        String result = sb.toString();
        if (stk.empty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(result);
        }
    }
}