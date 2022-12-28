// 2
// my name is ankush
// my name is rutwik

package conceptofjava;

import java.util.Scanner;

public class MultipleLineTestCaseInString {

    static void Print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int tc = Integer.parseInt(x);
        for (int i = 0; i < tc; i++) {
            String str = sc.nextLine();
            Print(str);
        }

    }
}
