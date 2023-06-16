// We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. Remeber that a subsequence maintains the order of characters selected from a sequence.

// More formally, let  be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If  is true, then  contains hackerrank.

// For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

// Example

// This contains a subsequence of all of the characters in the proper order. Answer YES

// This is missing the second 'r'. Answer NO.

// There is no 'c' after the first occurrence of an 'a', so answer NO.

// Function Description

// Complete the hackerrankInString function in the editor below.

// hackerrankInString has the following parameter(s):

// string s: a string
// Returns

// string: YES or NO
// Input Format

// The first line contains an integer , the number of queries.
// Each of the next  lines contains a single query string .

// Constraints

// Sample Input 0

// 2
// hereiamstackerrank
// hackerworld
// Sample Output 0

// YES
// NO
// Explanation 0

// We perform the following  queries:

// The characters of hackerrank are bolded in the string above. Because the string contains all the characters in hackerrank in the same exact order as they appear in hackerrank, we return YES.
//  does not contain the last three characters of hackerrank, so we return NO.
// Sample Input 1

// 2
// hhaacckkekraraannk
// rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt
// Sample Output 1

// YES
// NO

import java.io.*;
import java.util.*;

class Result {
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int n = target.length();
        int i = 0, j = 0;

        while (i < n && j < s.length()) {
            if (target.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }

        return (i == n) ? "YES" : "NO";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
