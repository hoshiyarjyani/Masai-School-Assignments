import java.util.*;

class Main {

    public static void myFun(int[] arr, int n) {
        int a = 0;
        int v = 0;
        boolean ab = true;
        for (int i = 0; i < n * 6; i++) {
            if (arr[i] % 2 != 0 && ab == true) {
                a += arr[i];
                ab = false;
            } else if (ab == true) {
                a += arr[i];
            } else if (arr[i] % 2 != 0 && ab == false) {
                v += arr[i];
                ab = true;
            } else {
                v += arr[i];
            }
            if ((i + 1) % 6 == 0 && ab == true) {
                ab = false;
            } else if ((i + 1) % 6 == 0 && ab == false) {
                ab = true;
            }
        }
        if (a > v) {
            System.out.println("AB de Villiers");
        } else if (a < v) {
            System.out.println("Virat Kohli");
        } else {
            System.out.println("Tie");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[n * 6];
            String[] line = sc.nextLine().trim().split(" ");
            for (int j = 0; j < n * 6; j++) {
                arr[j] = Integer.parseInt(line[j]);
            }
            myFun(arr, n);
        }
    }
}