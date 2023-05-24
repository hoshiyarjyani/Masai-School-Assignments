import java.util.*;

class TwoSum {
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
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == k) {
                        System.out.println(i + " " + j);
                        flag = false;
                    }
                }
                if (!flag) {
                    break;
                }
            }

            if (flag) {
                System.out.println(-1 + " " + -1);
            }

        }
    }
}

// Input

// 3
// 4 9
// 2 7 11 15
// 5 10
// 1 2 3 5 5
// 2 100
// 48 49

// Output

// 0 1
// 3 4
// -1 -1