package conceptofjava;

import java.util.Scanner;

public class StringCut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int half = s.length() / 2;

        if (s.length() % 2 == 1) {

            String firstHalf = s.substring(0, half);
            String secondHalf = s.substring(half + 1);
            String reversedF = "";
            for (int i = firstHalf.length() - 1; i >= 0; i--) {
                reversedF += firstHalf.charAt(i);
            }
            String reversedL = "";
            for (int i = secondHalf.length() - 1; i >= 0; i--) {
                reversedL += secondHalf.charAt(i);
            }
            char str = s.charAt(half);
            String result = reversedF + str + reversedL;
            System.out.println(result);
        } else {
            String firstHalfs = s.substring(0, half);
            String secondHalfs = s.substring(half);
            String reversedFs = "";
            for (int i = firstHalfs.length() - 1; i >= 0; i--) {
                reversedFs += firstHalfs.charAt(i);
            }
            String reversedLs = "";
            for (int i = secondHalfs.length() - 1; i >= 0; i--) {
                reversedLs += secondHalfs.charAt(i);
            }

            String results = reversedFs + reversedLs;
            System.out.println(results);
        }

    }
}
