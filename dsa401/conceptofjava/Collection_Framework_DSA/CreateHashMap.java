// Create your own HashMap -14:46:57
// Description

// You are given a function called createMap. An array of integers is passed to this function as an arguement

// You have to create a hashmap using the given array, such that the keys are the unique elements in the array, and value is the frequency of the elements of the array

// The given function returns the given hashmap

// You don't have to take the input or the output. Just complete the function and return the hashmap as mentioned above

// Input
// You don't have to take the input or the output. Just complete the function and return the hashmap as mentioned above

// Output
// You don't have to take the input or the output. Just complete the function and return the hashmap as mentioned above

// Sample Input 1 

// 5
// 1 2 3 4 5
// Sample Output 1

// 1->1
// 2->1
// 3->1
// 4->1
// 5->1

package conceptofjava.Collection_Framework_DSA;

import java.util.HashMap;

public class CreateHashMap {

    public static HashMap<Integer, Integer> createMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        HashMap<Integer, Integer> map = createMap(arr);
        for (Integer key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }
}
