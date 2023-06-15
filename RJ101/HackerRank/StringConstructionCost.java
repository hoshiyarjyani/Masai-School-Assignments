// Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :

// Append a character to the end of string  at a cost of  dollar.
// Choose any substring of  and append it to the end of  at no charge.
// Given  strings , find and print the minimum cost of copying each  to  on a new line.

// For example, given a string , it can be copied for  dollars. Start by copying ,  and  individually at a cost of  dollar per character. String  at this time. Copy  to the end of  at no cost to complete the copy.

// Function Description

// Complete the stringConstruction function in the editor below. It should return the minimum cost of copying a string.

// stringConstruction has the following parameter(s):

// s: a string
// Input Format

// The first line contains a single integer , the number of strings.
// Each of the next  lines contains a single string, .

// Constraints

// Subtasks

//  for  of the maximum score.
// Output Format

// For each string  print the minimum cost of constructing a new string  on a new line.

// Sample Input

// 2
// abcd
// abab
// Sample Output

// 4
// 2
// Explanation

// Query 0: We start with  and .

// Append character '' to  at a cost of  dollar, .
// Append character '' to  at a cost of  dollar, .
// Append character '' to  at a cost of  dollar, .
// Append character '' to  at a cost of  dollar, .
// Because the total cost of all operations is  dollars, we print  on a new line.

// Query 1: We start with  and .

// Append character '' to  at a cost of  dollar, .
// Append character '' to  at a cost of  dollar, .
// Append substring  to  at no cost, .
// Because the total cost of all operations is  dollars, we print  on a new line.

// Note

// A substring of a string  is another string  that occurs "in"  (Wikipedia). For example, the substrings of the string "" are "", "" ,"", "", "", and "".

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
     * Complete the 'stringConstruction' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringConstruction(String s) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.stringConstruction(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
