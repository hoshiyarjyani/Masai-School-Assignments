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

Sample Input

2
9
10 5 20 20 4 5 2 25 1
10
3 4 21 36 10 28 35 5 24 42

Sample Output

2 4
4 0