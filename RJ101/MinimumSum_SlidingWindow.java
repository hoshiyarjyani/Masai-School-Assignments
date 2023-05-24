import java.util.*;

class MinimumSum_SlidingWindow {
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

            int minSum = 0;
            for (int i = 0; i < k; i++) {
                minSum += arr[i];
            }

            int sum = minSum;
            for (int i = k; i < n; i++) {
                sum += arr[i] - arr[i - k];
                minSum = Math.min(minSum, sum);
            }

            System.out.println(minSum);

        }
    }
}

// Input

// 2
// 5 3
// 9 9 -5 9 5
// 5 4
// 2 7 6 2 -5

// Output

// 9
// 10