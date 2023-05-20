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

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if ((arr[j] * arr[j]) > (arr[j + 1] * arr[j + 1])) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// input
// 1
// 5
// -2 3 1 -4 6

// output
// 1 -2 3 -4 6 