import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        int k = sc.nextInt();

        char[] arr2 = sc.next().toCharArray();

        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(arr[i]);
        }
        boolean check = true;
        for (int i = 0; i < k; i++) {
            if (al.contains(arr2[i])) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Yes" : "No");
    }
}