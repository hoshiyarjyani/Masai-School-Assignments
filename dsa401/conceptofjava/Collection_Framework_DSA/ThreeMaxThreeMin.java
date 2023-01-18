// Three Max, Three Min Please -26:0:21
// Description

// Given an array of N integers, print the 3 distinct maximum and 3 distinct minimum elements of the array.

// Input
// Input Format

// First line contains N

// Second line contains N space separated integers which are elements of the array.

// Constraints

// 0<=N<=100 (Please note that N can be 0 as well)

// The values present in the array can be negative as well.

// Output
// In the first line, print the least 3 values (sorted) present in the array.

// In the second line, print the top 3 values (sorted) present in the array.

// In case there are not 3 min value, print "Not Possible" (without quotes).

// In case there are not 3 max value, print "Not Possible" (without quotes).

// So, according to the above statements, if both are not possible, you have to print "Not Possible" twice (once for each)

// In the array, if you found out only 2 distinct min and 2 distinct max elements then also printNot Possibletwice [ one for minimum and other for maximum]

// Sample Input 1 

// 8
// 1 2 3 4 2 1 6 5
// Sample Output 1

// 1 2 3
// 4 5 6
// Language: 

// Theme: 
// Font Size: 10

//   
//    Test against custom input
// Status  Accepted
// Masai School

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMajorityElement(arr, n);
    }

    public static void findMajorityElement(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (int key : map.keySet()) {
            num.add(key);
        }
        Collections.sort(num);
        if (num.size() < 3) {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        } else {
            int k = num.size();
            System.out.println(num.get(0) + " " + num.get(1) + " " + num.get(2));
            System.out.println(num.get(k - 3) + " " + num.get(k - 2) + " " + num.get(k - 1));
        }
    }
}