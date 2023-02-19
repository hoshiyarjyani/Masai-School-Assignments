// 8 3
// 1 2 3 3 3 4 5 6

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = search(arr, n, k);
        System.out.println(count);
    }

    static int search(int[] arr, int n, int k) {
        // 1 2 3 3 3 4 5 6
        int left = 0;
        int right = n - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < k) {
                left = mid + 1;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                count++;
                int i = mid + 1;
                int j = mid - 1;
                while (i >= 0 && arr[i] == k) {
                    count++;
                    i--;
                }
                while (j < n && arr[j] == k) {
                    count++;
                    j++;
                }
                break;
            }
        }
        return count;
    }

}
