import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int tar = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = myFun(s, tar, x, y);
        System.out.println(ans);
    }

    static int myFun(int s, int tar, int x, int y) {
        if (s == tar) {
            return 0;
        }
        if (s > tar) {
            return -1;
        }
        int dpx = myFun(s * x, tar, x, y);
        int dpy = myFun(s * y, tar, x, y);

        if (dpx == -1 && dpy == -1) {
            return -1;
        }
        if (dpy == -1) {
            return dpx + 1;
        }
        if (dpx == -1) {
            return dpy + 1;
        }
        int ans = Math.min(dpx, dpy);
        return ans + 1;
    }
}

// Input

// 4 5184 2 3

// Output

// 8