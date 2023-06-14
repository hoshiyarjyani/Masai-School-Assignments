// There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

// Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

// Example

// The minerals  and  appear in each rock, so there are  gemstones.

// Function Description

// Complete the gemstones function in the editor below.

// gemstones has the following parameter(s):

// string arr[n]: an array of strings
// Returns

// int: the number of gemstones found
// Input Format

// The first line consists of an integer , the size of .
// Each of the next  lines contains a string  where each letter represents an occurence of a mineral in the current rock.

// Constraints

//  | arr[i] | 
// Each composition  consists of only lower-case Latin letters ('a'-'z').

// Sample Input

// STDIN       Function
// -----       --------
// 3           arr[] size n = 3
// abcdde      arr = ['abcdde', 'baccd', 'eeabg']
// baccd
// eeabg
// Sample Output

// 2
// Explanation

// Only  and  occur in every rock.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        Map<Character, Integer> map = new HashMap<>();
        int numRocks = arr.size();

        for (String rock : arr) {
            Set<Character> mineralsInRock = new HashSet<>();
            for (char mineral : rock.toCharArray()) {
                mineralsInRock.add(mineral);
            }

            for (char mineral : mineralsInRock) {
                if (map.containsKey(mineral)) {
                    map.put(mineral, map.get(mineral) + 1);
                } else {
                    map.put(mineral, 1);
                }
            }
        }

        int gemstonesCount = 0;
        for (int count : map.values()) {
            if (count == numRocks) {
                gemstonesCount++;
            }
        }

        return gemstonesCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String arrItem = bufferedReader.readLine();
            arr.add(arrItem);
        }

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

https://www.hackerrank.com/challenges/gem-stones/problem?h_r=next-challenge&h_v=zen