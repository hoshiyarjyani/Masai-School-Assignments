import java.util.*;

public class ElementInTheMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            // check if left elements are strictly smaller
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    flag = false;
                    break;
                }
            }
            // check if right elements are strictly greater
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result = arr[i];
                break;
            }
        }
        System.out.println(result);
    }
}
