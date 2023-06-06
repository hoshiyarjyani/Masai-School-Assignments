import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int high = 0;
            int low = 0;
            int h = arr[0];
            int l = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > h) {
                    h = arr[i];
                    high++;
                }
                if (arr[i] < l) {
                    l = arr[i];
                    low++;
                }

            }
            System.out.println(high + " " + low);

        }
    }
}