// Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

// Its length is at least .
// It contains at least one digit.
// It contains at least one lowercase English character.
// It contains at least one uppercase English character.
// It contains at least one special character. The special characters are: !@#$%^&*()-+
// She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

// Note: Here's the set of types of characters in a form you can paste in your solution:

// numbers = "0123456789"
// lower_case = "abcdefghijklmnopqrstuvwxyz"
// upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
// special_characters = "!@#$%^&*()-+"
// Example

// This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is .

// This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is .

// Function Description

// Complete the minimumNumber function in the editor below.

// minimumNumber has the following parameters:

// int n: the length of the password
// string password: the password to test
// Returns

// int: the minimum number of characters to add
// Input Format

// The first line contains an integer , the length of the password.

// The second line contains the password string. Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

// Constraints

// All characters in  are in [a-z], [A-Z], [0-9], or [!@#$%^&*()-+ ].
// Sample Input 0

// 3
// Ab1
// Sample Output 0

// 3
// Explanation 0

// She can make the password strong by adding  characters, for example, $hk, turning the password into Ab1$hk which is strong.

//  characters aren't enough since the length must be at least .

// Sample Input 1

// 11
// #HackerRank
// Sample Output 1

// 1
// Explanation 1

// The password isn't strong, but she can make it strong by adding a single digit.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        // Check each criteria individually
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (numbers.indexOf(ch) != -1)
                hasNumber = true;
            else if (lower_case.indexOf(ch) != -1)
                hasLowerCase = true;
            else if (upper_case.indexOf(ch) != -1)
                hasUpperCase = true;
            else if (special_characters.indexOf(ch) != -1)
                hasSpecialChar = true;
        }

        // Calculate the minimum number of characters to add
        int missingCriteria = 0;
        if (!hasNumber)
            missingCriteria++;
        if (!hasLowerCase)
            missingCriteria++;
        if (!hasUpperCase)
            missingCriteria++;
        if (!hasSpecialChar)
            missingCriteria++;

        // Check if the length criteria is satisfied
        if (n < 6 && missingCriteria < (6 - n))
            return 6 - n;
        else
            return missingCriteria;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true