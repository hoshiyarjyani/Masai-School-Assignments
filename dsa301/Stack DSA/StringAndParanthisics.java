// Strings with Parenthesis -0:6:59
// Description

// Given a string containing three types of parenthesis : (), [], {}, write a program to check whether the string contains a valid sequence of parentheses.

// Input
// Input Format

// Input contains one line which is the string with parentheses whose validity you have to check

// Constraints

// length of string <= 1000

// Output
// Output Format

// Print "balanced" (without quotes) if it has a sequence of valid parentheses, otherwise print "unbalanced" (without quotes)

// Sample Input 1 

// (((((((((())))))))))
// Sample Output 1

// balanced
// Sample Input 2 

// [one[two[three[four[five[six[seven[eight[nine[ten]]]]]]]]]]
// Sample Output 2

// balanced

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stk.empty()) {
                    System.out.println("unbalanced");
                    return;
                } else {
                    char poped = stk.pop();
                    if (poped == '(' && c != ')' || poped == '[' && c != ']' || poped == '{' && c != '}') {
                        System.out.println("unbalanced");
                        return;
                    }
                }
            }
        }
        if (!stk.empty()) {
            System.out.println("unbalnced");
            return;
        } else {
            System.out.println("balanced");
        }
    }
}