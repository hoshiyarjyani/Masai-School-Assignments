import java.util.*;

class RotateTheArrayGivenTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            
            int t = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int newPos = (i + t) % n;
                res[newPos] = arr[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}