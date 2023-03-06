import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int num = sc.nextInt();
            long res = 0;
            int len = Integer.toString(num).length();
            if (len == 1) {
                res = num - 1;
            } else if (len == 2) {
                res = num - 10;
            } else if (len == 3) {
                res = num - 100;
            } else if (len == 4) {
                res = num - 1000;
            } else if (len == 5) {
                res = num - 10000;
            } else if (len == 6) {
                res = num - 100000;
            } else if (len == 7) {
                res = num - 1000000;
            } else if (len == 8) {
                res = num - 10000000;
            } else if (len == 9) {
                res = num - 100000000;
            }
            System.out.println(res);
        }
    }
}