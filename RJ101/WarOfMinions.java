import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (!stk.empty() && stk.peek() == str.charAt(i)) {
                stk.pop();
            } else {
                stk.push(c);
            }
        }
        if (stk.empty()) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : stk) {
                sb.append(c);
            }
            System.out.print(sb);
        }
    }
}