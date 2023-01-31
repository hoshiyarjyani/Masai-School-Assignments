// Missing Integer Ended
// Description

// You are given an array of N-1 integers and integers are in the range of 1 to N. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer

// Input
// Input Format

// The first and only line contains N-1 integers

// Constraints

// N<100

// Output
// Print the one number belonging from 1 to N which is not present in the array

// Sample Input 1 

// 4 5 1 3
// Sample Output 1

// 2

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        Collections.sort(numbers);
        int k = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != k) {
                System.out.println(k);
                break;
            }
            k++;
        }

    }
}