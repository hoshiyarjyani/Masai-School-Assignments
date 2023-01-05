package BackTracking;

public class Permutation {
    static void perFun(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                perFun(str, l + 1, r);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABC";
        perFun(str, 0, 2);
    }
}
