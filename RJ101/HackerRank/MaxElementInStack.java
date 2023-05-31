// You have an empty sequence, and you will be given  queries. Each query is one of these three types:

// 1 x  -Push the element x into the stack.
// 2    -Delete the element present at the top of the stack.
// 3    -Print the maximum element in the stack.
// Function Description

// Complete the getMax function in the editor below.

// getMax has the following parameters:
// - string operations[n]: operations as strings

// Returns
// - int[]: the answers to each type 3 query

// Input Format

// The first line of input contains an integer, . The next  lines each contain an above mentioned query.

// Constraints

// Constraints

// All queries are valid.

// Sample Input

// STDIN   Function
// -----   --------
// 10      operations[] size n = 10
// 1 97    operations = ['1 97', '2', '1 20', ....]
// 2
// 1 20
// 2
// 1 26
// 1 20
// 2
// 3
// 1 91
// 3
// Sample Output

// 26
// 91

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();

        for (String operation : operations) {
            String[] query = operation.split(" ");

            if (query[0].equals("1")) {
                int element = Integer.parseInt(query[1]);
                stack.push(element);
                if (maxStack.isEmpty() || element >= maxStack.peek()) {
                    maxStack.push(element);
                }
            } else if (query[0].equals("2")) {
                int poppedElement = stack.pop();
                if (poppedElement == maxStack.peek()) {
                    maxStack.pop();
                }
            } else {
                resultList.add(maxStack.peek());
            }
        }

        return resultList;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String opsItem = bufferedReader.readLine();
            ops.add(opsItem);
        }

        List<Integer> res = Result.getMax(ops);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
