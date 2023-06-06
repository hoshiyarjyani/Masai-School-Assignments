import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int count = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(fun(arr));
        }
    }
    static int fun(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 1; i < Math.pow(2, n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    sum += arr[j];
                }
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}


Sample Input 

2
4
4 3 2 1
2
2 4

Sample Output

7
3


https://oj.masaischool.com/contest/9258/problem/501