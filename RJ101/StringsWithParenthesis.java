import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stk.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stk.empty()) {
                    System.out.println("unbalanced");
                    return;
                } else {
                    char rem = stk.pop();
                    if (rem == '(' && c != ')' || rem == '[' && c != ']' || rem == '{' && c != '}') {
                        System.out.println("unbalanced");
                        return;
                    }
                }
            }
        }
        System.out.println(stk.empty() ? "balanced" : "unbalanced");

    }
}