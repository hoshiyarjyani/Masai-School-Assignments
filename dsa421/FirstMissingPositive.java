import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int k = 1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == k) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}