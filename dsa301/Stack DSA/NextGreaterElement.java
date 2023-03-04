// Next Greater Element Ended
// Description

// Given an array of N elements, find the next greater element for each element in the array, print -1 if it does not exits. Refer to the sample I/O for better understanding

// Input
// The first line contains T, the number of test cases.

// The first line of each test case contains N, the number of elements in the array. The next line contains N space separated integers denoting the elements of the array

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^5

// 0 <= A[i] <= 10000

// Output
// For each test case, print N space separated integers, denoting the next greater element for each element,  on a new line.

// Sample Input 1 

// 1
// 4
// 1 3 2 4
// Sample Output 1

// 3 4 4 -1
// Hint

// In the sample test case, the array contains 4 elements, and for the first element, the next greater element will be 3, similarly for the next element, the next greater element will be 4, and for the third element as well, the next greater element will be 4. Since, the last element has no elements ahead of it, the next greater element will be -1.

//1
//4
//1 3 2 4
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stk = new Stack<>();
            int [] res = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                while (!stk.empty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }
                if (stk.empty()) {
                    res[i] = -1;
                } else {
                    res[i] = stk.peek();
                }

                stk.push(arr[i]);

            }
            for (int elem : res) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}