// Input Taking and Even or Odd findout.
package JavaBasicQuestion;

import java.util.*;

public class evenOrOdd {

    public static void EvenOrOdd(int N) {
        // write your code here
        if (N % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        EvenOrOdd(N);
    }

}
