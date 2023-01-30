// Motu to Potlu house Ended
// Description

// Motu decided to visit his friend Potlu. It turned out that the Motu's house is located at point 0 and his friend's house is located at point x (x > 0) of the coordinate line. In one step the Motu can move 1, 2, 3, 4 or 5 positions forward.

// Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

// Input
// Input Format :

// First and the only line contain the integer n which denotes the position of his friend's house.

// Constraints :

// 1 <= n <= 10^6

// Output
// Output contains a single line denoting the minimum number of steps.

// Sample Input 1 

// 26
// Sample Output 1

// 6
// Hint

// Output Explanation :

// For n = 26, Motu can move as

// 5 --> 5 --> 5 --> 5 --> 5 --> 1

// Hence he needed 6 steps to reach at position 26.

import java.util.*;

class Main {

    public static void myFun(int x) {
        if (x > 5) {
            if (x % 5 == 0) {
                System.out.println(x / 5);
            } else {
                System.out.println((int) (Math.floor(x / 5) + 1));
            }
        } else {
            System.out.println(1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        myFun(x);
    }
}