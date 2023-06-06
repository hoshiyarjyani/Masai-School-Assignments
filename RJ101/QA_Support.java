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


Sample Input

5
4
QQAA
4
QQAQ
3
QAA
1
Q
14
QAQQAQAAQQQAAA


Sample Output

Yes
No
Yes
No
Yes

https://oj.masaischool.com/contest/9258/problem/201