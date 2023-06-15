// Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

// door

// But, to lock the door he needs a key that is an anagram of a palindrome. He starts to go through his box of strings, checking to see if they can be rearranged into a palindrome. Given a string, determine if it can be rearranged into a palindrome. Return the string YES or NO.

// Example

// One way this can be arranged into a palindrome is . Return YES.

// Function Description
// Complete the gameOfThrones function below.

// gameOfThrones has the following parameter(s):

// string s: a string to analyze
// Returns

// string: either YES or NO
// Input Format

// A single line which contains .

// Constraints

//  |s| 
//  contains only lowercase letters in the range 
// Sample Input 0

// aaabbbb
// Sample Output 0

// YES
// Explanation 0

// A palindromic permutation of the given string is bbaaabb.

// Sample Input 1

// cdefghmnopqrstuvw
// Sample Output 1

// NO
// Explanation 1

// Palindromes longer than 1 character are made up of pairs of characters. There are none here.

// Sample Input 2

// cdcdcdcdeeeef
// Sample Output 2

// YES
// Explanation 2

// An example palindrome from the string: ddcceefeeccdd.

import java.io.*;
import java.util.*;

class Result {

    public static String gameOfThrones(String s) {
        int n = s.length();
        if (n == 1) {
            return "YES";
        } else {
            Map<Character, Integer> map = new HashMap<>();

            // Count the occurrences of characters in s
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            int count = 0;
            for (int value : map.values()) {
                if (count > 1) {
                    return "NO";
                } else if (value % 2 == 1) {
                    count++;
                }
            }

            return "YES";
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
