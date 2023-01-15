import java.util.*;

public class CricketScoreCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int six = sc.nextInt();
        myFun(one, two, three, four, six);
    }

    public static void myFun(int one, int two, int three, int four, int six) {
        int total = one * 1 + two * 2 + three * 3 + four * 4 + six * 6;
        System.out.println(total);

    }
}
// Cricket Score -13:0:43
// Description

// You are given the numbers of 1 runs, 2 runs, 3 runs, fours and sixes scored
// by a batsman. Your task is to compute total run scored by that batsman.

// Input
// Input Format:

// First line contains 5 positive space separated integers which represents
// number of 1s, 2s, 3s, fours and sixes scored by the batsman.

// Constraints:

// All the scores<100

// Output
// Output total run scored by the batsman

// Sample Input 1

// 12 8 5 6 3
// Sample Output 1

// 85