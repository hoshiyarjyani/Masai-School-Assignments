import java.util.*;

class MarkAndToys_Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bud = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        int price = 0;
        for (int i = 0; i < n; i++) {
            if ((price + arr[i]) <= bud) {
                price += arr[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

// Input

// 7 50
// 1 12 5 111 200 1000 10

// Output

// 4

// hint - he can but max 4 toys.
