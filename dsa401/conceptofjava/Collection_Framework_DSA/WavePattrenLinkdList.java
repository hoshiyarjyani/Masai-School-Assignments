// Wave pattern -25:48:9
// Description

// Given a Linked List of unsorted integers with unique values, we need to check that it forms a wave pattern or not. A sequence is said to be in wave pattern if it is increasing and then decreasing alternatively or vice versa.

// For example, if we have a linked list 4->7->2->8. This represents a wave pattern shown below:

// If the list forms a wave pattern, return “true” (without quotes), otherwise “false” (without quotes).

// Note

// You don’t need to take input/output. Just implement the given function.

// Input
// The first line of input contains a single positive integer T denoting the number of test cases.

// The first line of each test case contains a single positive integer N denoting the number of elements of the linked list.

// The second line each test case contains the elements of the unsorted linked list.

// Function description

// checkWavePattern(head) {

// // Write your code here

// }
// Arguments:

// head = head node of the LinkedList.
// Constraints

// 1 <= T <= 10

// 3 <= N <= 10^4

// 1<= node.val <=10^6

// Output
// Return “true” if LinkedList forms a wave pattern otherwise “false”, without quotes.

// Sample Input 1 

// 1
// 5
// 4 7 3 6 5
// Sample Output 1

// true
// Sample Input 2 

// 1
// 5
// 2 5 8 9 1
// Sample Output 2

// false
// Hint

// Explanation of Sample 1

// The given linked list can be represented as-

// No three consecutive nodes are in ascending nor in descending order. Hence, it clearly represents a wave.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public boolean checkWavePattern(ListNode head) {
        // Write your code here
        ListNode curr = head;
        boolean flag;
        if (curr.val < curr.next.val) {
            flag = true;
        } else {
            flag = false;
        }

        while (curr.next != null) {
            if (curr.val < curr.next.val && flag == true) {
                flag = false;
            } else if (curr.val > curr.next.val && flag == false) {
                flag = true;
            } else {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
}
