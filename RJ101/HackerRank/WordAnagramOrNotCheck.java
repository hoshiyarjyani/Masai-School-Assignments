// Two words are anagrams of one another if their letters can be rearranged to form the other word.

// Given a string, split it into two contiguous substrings of equal length. Determine the minimum number of characters to change to make the two substrings into anagrams of one another.

// Example

// Break  into two parts: 'abc' and 'cde'. Note that all letters have been used, the substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.

// Function Description

// Complete the anagram function in the editor below.

// anagram has the following parameter(s):

// string s: a string
// Returns

// int: the minimum number of characters to change or -1.
// Input Format

// The first line will contain an integer, , the number of test cases.
// Each test case will contain a string .

// Constraints

//  consists only of characters in the range ascii[a-z].
// Sample Input

// 6
// aaabbb
// ab
// abc
// mnop
// xyyx
// xaxbbbxx
// Sample Output

// 3
// 1
// -1
// 2
// 0
// 1
// Explanation

// Test Case #01: We split  into two strings ='aaa' and ='bbb'. We have to replace all three characters from the first string with 'b' to make the strings anagrams.

// Test Case #02: You have to replace 'a' with 'b', which will generate "bb".

// Test Case #03: It is not possible for two strings of unequal length to be anagrams of one another.

// Test Case #04: We have to replace both the characters of first string ("mn") to make it an anagram of the other one.

// Test Case #05:  and  are already anagrams of one another.

// Test Case #06: Here S1 = "xaxb" and S2 = "bbxx". You must replace 'a' from S1 with 'b' so that S1 = "xbxb".

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Write your code here
        int n = s.length();
        if (n % 2 == 1) {
            return -1;
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n / 2; i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
            for (int i = n / 2; i < n; i++) {
                if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 0) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                }
            }

            int count = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                count += value;
            }
            return count;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

https://www.hackerrank.com/challenges/anagram/problem