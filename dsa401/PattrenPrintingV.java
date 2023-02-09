import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (j < i) {
                    if (j == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("  ");
                    }

                } else {
                    if (i == 0 && j == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}