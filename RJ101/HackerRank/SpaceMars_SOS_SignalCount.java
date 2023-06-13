// A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.

// NASA_Mars_Rover.jpg

// Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of the SOS message have been changed by radiation.

// Example

// The original message was SOSSOS. Two of the message's characters were changed in transit.

// Function Description

// Complete the marsExploration function in the editor below.

// marsExploration has the following parameter(s):

// string s: the string as received on Earth
// Returns

// int: the number of letters changed during transmission
// Input Format

// There is one line of input: a single string, .

// Constraints

//  will contain only uppercase English letters, ascii[A-Z].
// Sample Input 0

// SOSSPSSQSSOR
// Sample Output 0

// 3
// Explanation 0

//  = SOSSPSSQSSOR, and signal length . They sent  SOS messages (i.e.: ).

// Expected signal: SOSSOSSOSSOS
// Recieved signal: SOSSPSSQSSOR
// Difference:          X  X   X
// Sample Input 1

// SOSSOT
// Sample Output 1

// 1
// Explanation 1

//  = SOSSOT, and signal length . They sent  SOS messages (i.e.: ).

// Expected Signal: SOSSOS     
// Received Signal: SOSSOT
// Difference:           X
// Sample Input 2

// SOSSOSSOS
// Sample Output 2

// 0
// Explanation 2

// Since no character is altered, return 0.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') {
                count++;
            }
            if (s.charAt(i + 1) != 'O') {
                count++;
            }
            if (s.charAt(i + 2) != 'S') {
                count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true&h_r=next-challenge&h_v=zen