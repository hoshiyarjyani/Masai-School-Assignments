// Count such pairs Ended
// Description

// You are given an arrayAofNintegers along with a target integerK.

// Your task is to find out the number of pairs of integers present in the array, whose sum is equal to the target valueK.

// Input
// Input Format :

// First line contains 2 integers: N and K.

// Second line contains N space separated integers which are the elements of the array.

// Constraints :

// 1 <= N <= 100

// Output
// Print the count of such pairs whose sum is K.

// Sample Input 1 

// 5 9
// 3 0 6 2 7
// Sample Output 1

// 2
// Hint

// Pairs whose sum is 9 are:- {3,6} , {2, 7}. So answer is 2.



//Approch 1 (Easy nested loop)
// public static void countSuchPairs(int n,int target, int[] arr){
//     //write your code here
//       int count=0;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//         if((arr[i]+arr[j])==target){
//             count++;
//         }
//        }
//     }System.out.println(count);
//   }




//Approch 2nd
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        // use a hashmap to keep track of elements in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int target = k - i;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        System.out.println(count);
    }
}

