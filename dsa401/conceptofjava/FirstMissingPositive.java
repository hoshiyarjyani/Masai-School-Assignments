// First missing positive Ended
// Description

// Given an unsorted integer array nums, return the smallest missing positive integer.

// You must implement an algorithm that runs inO(n)time and uses constant extra space.

// Input
// Input Format
// The input contains of multiple testcases

// The first line of each testcase contains an integer t.

// The next 2*t line contain the description of the testcases.

// The first line of each testcase contains an integer n, the size of the array.

// The second line of each testcase contain n space-separated integers, denoting the n elements of the array.

// Constraints
// 1 <=t<= 10^3

// 1 <=nums.length<= 1^05

// -2^31 <=nums[i]<= 2^31 - 1

// Output
// Output Format
// For each testcase output one integer, the smallest missing positive integer on a new line.

// Sample Input 1 

// 3
// 3
// 1 2 0
// 4
// 3 4 -1 1
// 5
// 7 8 9 11 12
// Sample Output 1

// 3
// 2
// 1
// Hint

// First testcase
// 3 is the smallest positive integer which is not present in the array.

// Second testcase
// We have 1 3 and 4 present in the array, so the smallest positive integer not in the array is 2.

// Third testcase
// 1 is the smallest positive integer not in the array.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int j = 0; j < tc; j++) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            int x = myFun(arr, n);
            System.out.println(x);
        }
    }

    static int myFun(List<Integer> arr, int n) {

        // create postive container till highest number
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            list.add(i);
        }
        // find element
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            if (arr.contains(list.get(i))) {
                continue;
            } else {
                ans = list.get(i);
                break;
            }
        }
        return ans;
    }
}