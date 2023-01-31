// Repeated and Missing Ended
// Description

// Given an array of size n. Array elements are in the range from 1 to n. In the given array, one number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

// Print the missing one first and then the repeated one with a space character in between them.

// Expected Auxillary Space Complexity - O(1)

// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

// The first line of each test case contains a single integer n (2 ≤ n ≤ 100000).

// The second line of the test case contains n integers (1 ≤ Ai ≤ n).

// Output
// For each test case, print the answer.

// Sample Input 1 

// 3
// 5
// 1 2 3 3 4
// 2
// 1 1
// 3
// 1 2 2
// Sample Output 1

// 5 3
// 2 1
// 3 2

import java.util.*;

class Main {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int ans = 0;
            int res = 1;
            boolean check = false;
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap();
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                if (!map.containsKey(k)) {
                    map.put(k, 1);
                } else {
                    map.put(k, map.get(k) + 1);
                }
                if (res != k && check == false) {
                    ans = res;
                    check = true;
                }
                res++;
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) {
                    System.out.println(ans + " " + entry.getKey());
                    break;
                }

            }

        }
    }
}