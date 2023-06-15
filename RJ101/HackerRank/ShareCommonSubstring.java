// Given two strings, determine if they share a common substring. A substring may be as small as one character.

// Example

// These share the common substring .

// These do not share a substring.

// Function Description

// Complete the function twoStrings in the editor below.

// twoStrings has the following parameter(s):

// string s1: a string
// string s2: another string
// Returns

// string: either YES or NO
// Input Format

// The first line contains a single integer , the number of test cases.

// The following  pairs of lines are as follows:

// The first line contains string .
// The second line contains string .
// Constraints

//  and  consist of characters in the range ascii[a-z].
// Output Format

// For each pair of strings, return YES or NO.

// Sample Input

// 2
// hello
// world
// hi
// world
// Sample Output

// YES
// NO
// Explanation

// We have  pairs to check:

// , . The substrings  and  are common to both strings.
// , .  and  share no common substrings.

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
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s1
     * 2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        boolean check = false;

        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                check = true;
                break;
            }
        }

        return check ? "YES" : "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
