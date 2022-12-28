//my name is ankush

package conceptofjava;

import java.util.Scanner;

public class StringLongSentenceInput {

    static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        print(str);
    }

}