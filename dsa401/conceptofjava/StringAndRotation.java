// Strings & Rotation -20:50:15
// Description

// Given two strings, find whether one string (s2) can be formed by rotating another string(s1).

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

package conceptofjava;

import java.util.Scanner;

public class StringAndRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sCheck = scanner.nextLine();
        int half = s.length() / 2;

        if (s.length() % 2 == 1) {

            String firstHalf = s.substring(0, half);
            String secondHalf = s.substring(half + 1);

            char str = s.charAt(half);
            String result = secondHalf + str + firstHalf;
            if (result.equals(sCheck)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }

        } else {
            String firstHalfs = s.substring(0, half);
            String secondHalfs = s.substring(half);

            String results = secondHalfs + firstHalfs;
            if (results.equals(sCheck)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
        }

    }
}