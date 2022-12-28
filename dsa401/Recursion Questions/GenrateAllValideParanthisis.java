//n=3;
// ((()))
// (()())
// (())()
// ()(())
// ()()()
public class GenrateAllValideParanthisis {
    static void myFun(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n) {
            myFun(s + "(", open + 1, close, n);
        }
        if (open > close) {
            myFun(s + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        myFun("", 0, 0, 3);
    }
}
