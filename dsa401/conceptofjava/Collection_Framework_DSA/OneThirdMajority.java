// One-Third Majority Ended
// Description

// Given an integer array of sizen, find all elements that appear more than⌊ n/3 ⌋times.

// Input
// Input Format

// The first line contains the number of integers N

// The second line contains the values of the array

// Constraints

// 1<=N<=10^5

// 1<=arr[i]<=10^5

// Output
// Print the majority elements in sorted order

// Sample Input 1 

// 3
// 3 2 3
// Sample Output 1

// 3
// Hint

// The element 3 occurs more than (3/3) 1 times
import java.util.*;

public class OneThirdMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // use a hashmap to store the count of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        // find the elements that appear more than n/3 times
        int threshold = n / 3;
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
