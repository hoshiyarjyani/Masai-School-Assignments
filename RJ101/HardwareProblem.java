import java.util.*;

class HardwareProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            boolean flag = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] <= k) {
                    System.out.println(arr[i + 1]);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(-1);
            }
        }
    }
}

// Input

// 3
// 4 500
// 300 900 1300 1700
// 5 99
// 100 200 300 400 500
// 4 500
// 100 600 1100 1600


// Output

// 1300
// -1
// 600