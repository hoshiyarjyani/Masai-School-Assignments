package JavaBasicQuestion;

import java.util.*;

public class DivisibleBy3 {
    public static void CheckDivide(int N) {
        // write your code here
        if (N % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        CheckDivide(N);
    }

}
