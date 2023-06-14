// James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

// To do this, he follows two rules:

// He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
// The letter  may not be reduced any further.
// Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

// Example

// The following two operations are performed: cde → cdd → cdc. Return .

// Function Description

// Complete the theLoveLetterMystery function in the editor below.

// theLoveLetterMystery has the following parameter(s):

// string s: the text of the letter
// Returns

// int: the minimum number of operations
// Input Format

// The first line contains an integer , the number of queries.
// The next  lines will each contain a string .

// Constraints

//  | s | 
// All strings are composed of lower case English letters, ascii[a-z], with no spaces.

// Sample Input

// STDIN   Function
// -----   --------
// 4       q = 4
// abc     query 1 = 'abc'
// abcba
// abcd
// cba
// Sample Output

// 2
// 0
// 4
// 2
// Explanation

// For the first query, abc → abb → aba.
// For the second query, abcba is already a palindromic string.
// For the third query, abcd → abcc → abcb → abca → abba.
// For the fourth query, cba → bba → aba.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'theLoveLetterMystery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int theLoveLetterMystery(String s) {

        int count = 0;

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            count += Math.abs(s.charAt(i) - s.charAt(j));
            i++;
            j--;
        }

        return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
