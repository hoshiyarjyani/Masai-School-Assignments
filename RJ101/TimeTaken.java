import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() - 1;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        while (arr[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    count++;
                    arr[i]--;
                    if (arr[k] == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}