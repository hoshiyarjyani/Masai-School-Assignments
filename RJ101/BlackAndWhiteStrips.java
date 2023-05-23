import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int x = Integer.MAX_VALUE;

            for (int i = 0; i <= n - k; i++) {
                int white = 0;
                for (int j = i; j < i + k; j++) {
                    if (str.charAt(j) == 'W') {
                        white++;
                    }
                }
                if (white < x) {
                    x = white;
                }
            }

            System.out.println(x);
        }
    }
}

// Input

// 4
// 5 3
// BBWBW
// 5 5
// BBWBW
// 5 1
// BBWBW
// 1 1
// W

// Output
// 1
// 2
// 0
// 1