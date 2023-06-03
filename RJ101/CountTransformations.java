import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = 0;
            System.out.println(fun(a, b, x));

        }
    }

    static int fun(int a, int b, int x) {
        if (a == b) {
            return x;
        }
        if (a < b) {
            return fun(a, b - a, x + 1);
        } else {
            return fun(a - b, b, x + 1);
        }
    }

}

// Input

// 3
// 3 8
// 12340 12340
// 1597 987

// Output
// 4
// 0
// 15