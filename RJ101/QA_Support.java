import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            Stack<Character> stk = new Stack<>();

            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if (c == 'Q') {
                    stk.push(c);
                } else {
                    if (!stk.empty()) {
                        stk.pop();
                    }
                }
            }

            System.out.println(stk.empty() ? "Yes" : "No");

        }

    }
}


