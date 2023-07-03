import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int ans = calculateSquareRoot(n);
            System.out.println(ans);
        }
    }

    private static int calculateSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long x = n;
        while (x * x > n) {
            x = (x + n / x) / 2;
        }

        return (int) x;
    }
}

Other Approch-


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int ans = calculateSquareRoot(n);
            System.out.println(ans);
        }
    }

    private static int calculateSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int start = 1;
        int end = n;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= n / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}



Sample Input
2
4
8

Sample Output
2
2

https://oj.masaischool.com/contest/9542/problem/10