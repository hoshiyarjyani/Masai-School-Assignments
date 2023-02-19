// All Twice Except One II Ended
// Description

// You are given a numberN, and an array such that the array contains all the numbers from 1 to N including N twice, except for one, which is present only once

// You have to find the number which is present only once, in the array

// Input
// The first line of the input containsT, the number of test cases

// The first line of each test case, containsN, the value as explained in the problem statement

// The next line contains2*N - 1, the number of elements in the array

// Constraints

// 1 <= T <= 10

// 1 <= N <= 2 * 10^5

// 1 <= arr[i] <= N

// Output
// For each test case, print the number which is present only once, on a new line

// Sample Input 1 

// 1
// 5
// 1 2 1 3 4 4 5 2 3
// Sample Output 1

// 5
// Hint

// In the sample test case, all the numbers except for 5 are present twice. Therefore, the output is5
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

public class AllTwiceExceptOne {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();

            }
            return str;
        }
    }

    public static void main(String[] args) {
        // This will take the input
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < 2 * N - 1; j++) {
                int num = sc.nextInt();
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            // System.out.println(map);
            for (Integer key : map.keySet()) {
                if (map.get(key) == 1) {
                    System.out.println(key);
                    break;
                }
            }
        }
    }
}
//imp