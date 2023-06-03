import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int attempt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            } else {
                attempt++;
                if (attempt == 2) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

// Input

// 9 6
// 4 3 7 6 7 2 2 2 2

// Output

// 3