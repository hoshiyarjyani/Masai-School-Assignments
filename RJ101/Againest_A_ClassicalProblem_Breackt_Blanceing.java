import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            boolean check = true;
            if (str.length() % 2 == 1) {
                System.out.println("not balanced");
            } else {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                        stack.push(str.charAt(i));
                    } else {
                        if (stack.isEmpty()) {
                            check = false;
                            break;
                        }
                        char top = stack.pop();
                        if ((str.charAt(i) == ')' && top != '(') ||
                                (str.charAt(i) == ']' && top != '[') ||
                                (str.charAt(i) == '}' && top != '{')) {
                            check = false;
                            break;
                        }
                    }
                }

                System.out.println(check ? "balanced" : "not balanced");
            }
        }
    }
}

// Input

// 3
// {([])}
// ()
// ([]

// Output

// balanced
// balanced
// not balanced