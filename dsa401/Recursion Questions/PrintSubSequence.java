// Print All SubSequence of "abc".

public class PrintSubSequence {
    static void printFun(String ans, char[] A, int low, int high) {
        if (low <= high + 1 && !ans.equals("")) {
            System.out.println(ans);
        }
        for (int i = low; i <= high; i++) {
            printFun(ans + A[i], A, i + 1, high);
        }
    }

    public static void main(String[] args) {
        char A[] = { 'a', 'b', 'c' };
        printFun("", A, 0, 2);
    }
}
