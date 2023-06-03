import java.util.*;

public class Main {
    public static void myFunction(int N, int[] arr) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            while (!stk1.isEmpty() && arr[stk1.peek()] <= arr[i]) {
                stk1.pop();
            }
            if (stk1.isEmpty()) {
                x.add(-1);
            } else {
                x.add(stk1.peek() + 1);
            }
            stk1.push(i);
        }

        for (int i = N - 1; i >= 0; i--) {
            while (!stk2.isEmpty() && arr[stk2.peek()] <= arr[i]) {
                stk2.pop();
            }
            if (stk2.isEmpty()) {
                y.add(-1);
            } else {
                y.add(stk2.peek() + 1);
            }
            stk2.push(i);
        }
        Collections.reverse(y);

        for (int i = 0; i < N; i++) {
            ans.add(x.get(i) + y.get(i));
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        myFunction(N, arr);
    }
}

// Input

// 5
// 5 4 1 3 2

// Output

// -2 0 6 1 3