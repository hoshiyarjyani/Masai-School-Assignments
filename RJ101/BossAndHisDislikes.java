// Remove the elements that present in other Array

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int x = sc.nextInt();
            List<Integer> arr2 = new ArrayList<>();
            for (int i = 0; i < x; i++)
                arr2.add(sc.nextInt());

            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (!arr2.contains(arr[i])) {
                    res.add(arr[i]);
                }
            }
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}

https://oj.masaischool.com/contest/9383/problem/4