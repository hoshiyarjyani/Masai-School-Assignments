import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        while (n-- > 0) {
            int x = sc.nextInt();
            if (x == 1) {
                queue.add(sc.nextInt());
            } else if (x == 2) {
                stk.push(sc.nextInt());
            } else if (x == 3) {
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if (x == 4) {
                System.out.println(stk.isEmpty() ? -1 : stk.peek());
            } else if (x == 5) {
                if (!queue.isEmpty()) {
                    stk.push(queue.poll());
                }
            }
        }
    }
}

// Input

// 7
// 1 4
// 2 3
// 1 2
// 3
// 4
// 5
// 4

// Output

// 4
// 3
// 4