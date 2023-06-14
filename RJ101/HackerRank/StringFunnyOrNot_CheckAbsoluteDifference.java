// In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

// Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

// Example

// The ordinal values of the charcters are .  and the ordinals are . The absolute differences of the adjacent elements for both strings are , so the answer is Funny.

// Function Description

// Complete the funnyString function in the editor below.

// funnyString has the following parameter(s):

// string s: a string to test
// Returns

// string: either Funny or Not Funny
// Input Format

// The first line contains an integer , the number of queries.
// The next  lines each contain a string, .

// Constraints

// Sample Input

// STDIN   Function
// -----   --------
// 2       q = 2
// acxz    s = 'acxz'
// bcxz    s = 'bcxz'
// Sample Output

// Funny
// Not Funny
// Explanation

// Let  be the reverse of .

// Test Case 0:

// , 
// Corresponding ASCII values of characters of the strings:
//  and 
// For both the strings the adjacent difference list is [2, 21, 2].

// Test Case 1:

// , 
// Corresponding ASCII values of characters of the strings:
//  and 
// The difference list for string  is [1, 21, 2] and for string  is [2, 21, 1].

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String funnyString(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        int[] str = new int[s.length() - 1];
        int[] con = new int[s.length() - 1];

        for (int i = 0; i < s.length() - 1; i++) {
            str[i] = Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }

        for (int i = s.length() - 2; i >= 0; i--) {
            con[i] = Math.abs((int) rev.charAt(i) - (int) rev.charAt(i + 1));
        }

        boolean check = true;
        for (int i = 0; i < str.length; i++) {
            if (!(str[i] == con[i])) {
                check = false;
                break;
            }
        }

        return check ? "Funny" : "Not Funny";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

https://www.hackerrank.com/challenges/funny-string/problem