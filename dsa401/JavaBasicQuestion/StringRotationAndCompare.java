package JavaBasicQuestion;

import java.util.Scanner;

public class StringRotationAndCompare {

    static boolean myFun(String str1, String str2) {
        int n = str1.length();
        String a = str1.substring(0, (n / 2));
        String b = str1.substring((n / 2), n);
        String c = b + a;
        if (c.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean x = myFun(str1, str2);
        if (x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}

// Strings & Rotation Ended
// Description

// Given two strings, find whether one string (s2) can be formed by rotating
// another string(s1).

// Example:For s1=”carbon”, s2=”boncar”, the output is "Yes" (without quotes)

// Input
// Input Format

// First line of input contains string s1

// Second line of the input contains string s2

// Constraints

// Length of string <= 100

// Output
// Output Format

// Output Yes/No based on the conditions mentioned above

// Sample Input 1

// carbon
// boncar
// Sample Output 1

// Yes
// Sample Input 2

// bucket
// buckte
// Sample Output 2

// No
