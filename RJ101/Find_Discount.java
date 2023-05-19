import java.util.*;

class Find_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] >= arr[j]) {
                        res[i] = arr[i] - arr[j];
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res[i] = arr[i];

                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}