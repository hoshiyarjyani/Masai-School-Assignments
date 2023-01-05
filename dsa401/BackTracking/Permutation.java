package BackTracking;

public class Permutation {
    static void perFun(String str, int s, int e) {
        if (s == e) {
            System.out.println(str);
        } else {
            for (int i = s; i <= e; i++) {
                str = swap(str, s, i);
                perFun(str, s + 1, e);
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
