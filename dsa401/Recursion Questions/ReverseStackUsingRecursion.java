import java.util.Stack;

public class ReverseStackUsingRecursion {
    static Stack<Integer> stk = new Stack<>();

    static void reverse() {
        if (stk.size() > 0) {
            int x = stk.pop();
            reverse();
            insert(x);
        }
    }

    static void insert(int x) {
        if (stk.isEmpty()) {
            stk.push(x);
        } else {
            int a = stk.pop();
            insert(x);
            stk.push(a);
        }
    }

    public static void main(String[] args) {
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        System.out.println(stk);
        reverse();
        System.out.println(stk);
    }

}
