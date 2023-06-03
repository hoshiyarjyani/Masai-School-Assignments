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
            int rickSum = 0;
            int chirdSum = 0;
            int banana1 = 0;
            int banana2 = 0;
            int i = 0;
            int j = n - 1;
            while (i <= j) {
                if (rickSum <= 2 * chirdSum) {
                    rickSum += arr[i];
                    i++;
                    banana1++;
                } else {
                    chirdSum += arr[j];
                    j--;
                    banana2++;
                }
            }
            System.out.println(banana1 + " " + banana2);
        }
    }
}

// Input

// 1
// 5
// 2 9 8 2 7

// Output

// 3 2