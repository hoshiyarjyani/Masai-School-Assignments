import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println(stk.isEmpty() ? "No Food" : stk.pop());
            } else {
                stk.push(sc.nextInt());
            }
        }
    }
}