// Anagram Pairs Ended
// Description

// Given n strings S1, S2, ... , Sn. Find the number of pairs i,j where i<j and i and j both range from 1 to n such that Si is an anagram of Sj.

// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

// The first line of each test case contains a single integer n (1 ≤ n ≤ 100000).

// The next n lines of each test case contain a string Si whose length is 10.

// Output
// For each test case, print the answer: The number of pairs.

// Sample Input 1 

// 2
// 5
// aaaaabbbbb
// baabbbbaaa
// aaaabbbbba
// xxxxxxxxxy
// yxxxxxxxxx
// 2
// abcdefghij
// jighdefabc
// Sample Output 1

// 4
// 1

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] str = new String[n];
            for (int j = 0; j < n; j++) {
                str[j] = sc.nextLine();
            }

            HashMap<String, Integer> anagrams = new HashMap<>();

            for (int j = 0; j < n; j++) {
                char[] chars = str[j].toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);
                if (!anagrams.containsKey(sorted)) {
                    anagrams.put(sorted, 1);
                } else {
                    anagrams.put(sorted, anagrams.get(sorted) + 1);
                }
            }
            int count = 0;
            for (Map.Entry<String, Integer> entry : anagrams.entrySet()) {
                if (entry.getValue() == 2) {
                    count += 1;
                }
                if (entry.getValue() > 2) {
                    count += entry.getValue();
                }
            }
            System.out.println(count);
        }

    }

}