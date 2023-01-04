package conceptofjava;

import java.util.Scanner;

public class SubstringOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        boolean isSubstring = false;
        if (s1.contains(s2)) {
            isSubstring = true;
        } else {
            isSubstring = false;
        }
        System.out.println(isSubstring ? "Yes" : "No");
    }
}
