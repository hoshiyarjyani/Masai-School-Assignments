// Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

// Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

// Example.


// aab shortens to b in one operation: remove the adjacent a characters.


// Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

// Function Description

// Complete the superReducedString function in the editor below.

// superReducedString has the following parameter(s):

// string s: a string to reduce
// Returns

// string: the reduced string or Empty String
// Input Format

// A single string, .

// Constraints

// Sample Input 0

// aaabccddd
// Sample Output 0

// abd
// Explanation 0

// Perform the following sequence of operations to get the final string:

// aaabccddd → abccddd → abddd → abd
// Sample Input 1

// aa
// Sample Output 1

// Empty String
// Explanation 1

// aa → Empty String
// Sample Input 2

// baab
// Sample Output 2

// Empty String
// Explanation 2

// baab → bb → Empty String


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    
    
    Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            return "Empty String";
        } else {
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}



https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true