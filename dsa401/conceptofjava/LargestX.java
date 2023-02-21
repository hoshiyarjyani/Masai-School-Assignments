import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tc = sc.nextInt(); // number of test cases
        for (int i = 0; i < Tc; i++) {
            int N = sc.nextInt(); // size of array
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            int result = solve(arr);
            System.out.println(result);
        }
    }

    public static int solve(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                int x = -arr[i];
                if (set.contains(x)) {
                    max = arr[i];
                }
            }

        }
        return (max == Integer.MIN_VALUE) ? -1 : max;
    }
}
