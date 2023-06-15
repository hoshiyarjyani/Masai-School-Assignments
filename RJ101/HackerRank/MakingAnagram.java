// We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

// Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Can you help her find this number?

// Given two strings,  and , that may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

// Example.

// The only characters that match are the 's so we have to remove  from  and  from  for a total of  deletions.

// Function Description

// Complete the makingAnagrams function in the editor below.

// makingAnagrams has the following parameter(s):

// string s1: a string
// string s2: a string
// Returns

// int: the minimum number of deletions needed
// Input Format

// The first line contains a single string, .
// The second line contains a single string, .

// Constraints

// It is guaranteed that  and  consist of lowercase English letters, ascii[a-z].
// Sample Input

// cde
// abc
// Sample Output

// 4
// Explanation

// Delete the following characters from our two strings to turn them into anagrams:

// Remove d and e from cde to get c.
// Remove a and b from abc to get c.
//  characters have to be deleted to make both strings anagrams.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int makingAnagrams(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        Map<Character, Integer> map = new HashMap<>();

        // Count the occurrences of characters in s1
        for (int i = 0; i < n1; i++) {
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int deletions = 0;

        // Check the occurrences of characters in s2 and calculate deletions
        for (int i = 0; i < n2; i++) {
            char ch = s2.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                deletions++;
            }
        }

        // Add the remaining characters in s1 to deletions
        for (int count : map.values()) {
            deletions += count;
        }

        return deletions;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
