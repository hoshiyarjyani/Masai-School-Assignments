// John Nash & Sets -15:30:58
// Description

// John Nash, the famous American Mathematician, is currently working on sets. Apart from being a great Mathematician, he is very particular about the order of numbers. Therefore, he wants everything in order. He is going to be working on two sets, but he wants to merge them together, to use his time optimally. Therefore, he asks you, his assistant, to merge the two sets, and form a new set, and arrange it in ascending order of numbers. The two sets are given in the form of arrays. Merge the two sets, and sort them in ascending order of elements. Note that sets do not contain any duplicate elements, so the new set formed should not have any duplicate elements.

// Input
// The first line contains T the number of test cases.

// The first line of each test case contains N, the size of the first set, next line have N space separated integers, denoting the elements of the first set.

// The next line contains M, the size of the second set, and the next line contains M space separated integers denoting the elements of the second set.

// Constraints
// 1 <= T <= 10

// 1 <= N,M <= 10^4

// -10^4 <= A[i] <= 10^4

// Output
// Print the set formed by merging the two sets together in sorted format.

// Sample Input 1 

// 1
// 4
// 1 2 3 4
// 5
// 1 2 3 4 5
// Sample Output 1

// 1 2 3 4 5 

package conceptofjava.Collection_Framework_DSA;

import java.util.*;

public class SortAndMergeTwoSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            List<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }
            int m = sc.nextInt();
            List<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr2.add(sc.nextInt());
            }
            myFun(arr1, n, arr2, m);
        }
    }

    public static void myFun(List<Integer> arr1, int n, List<Integer> arr2, int m) {
        Set<Integer> set = new TreeSet<>(arr1);
        set.addAll(arr2);
        Iterator<Integer> iterator = set.iterator();
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
