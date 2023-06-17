import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        String str = sr.next();                               
        leftRight(str);
    }
    static void leftRight(String str) {
        List<Integer> arr = new ArrayList<>();
        int j = 0;
        arr.add(j,0);
        for (int i = 0; i < str.length(); i++) {
            int value = arr.get(j);
            if (str.charAt(i) == 'L') {
                arr.add(j, value + 1);
            } else {
                arr.add(++j, value + 1);
            }
        }
        for (Integer elem : arr) {
            System.out.print(elem + " ");
        }
    }
}