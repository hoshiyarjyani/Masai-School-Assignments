// 2
// aman
// rutwik
package conceptofjava;

import java.util.Scanner;

public class MultipleLineInputString {

    static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int z = Integer.parseInt(x);
        for (int i = 0; i < z; i++) {
            String str = sc.nextLine();
            print(str);
        }

    }

}
