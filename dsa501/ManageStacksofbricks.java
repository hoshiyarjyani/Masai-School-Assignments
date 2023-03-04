import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int removeCost = sc.nextInt();
            int addCost = sc.nextInt();
            int[] stk1 = new int[n];
            int[] stk2 = new int[n];
            sc.nextLine();
            
            for (int i = 0; i < n; i++) {
                String elem = sc.nextLine();
                String[] strArr = elem.split(" ");
                stk1[i] = Integer.parseInt(strArr[0]);
                stk2[i] = Integer.parseInt(strArr[1]);
            }

            Arrays.sort(stk1);
            Arrays.sort(stk2);

            int totel = 0;

            for (int i = 0; i < n; i++) {
                if (stk1[i] < stk2[i]) {
                    int removing = stk2[i] - stk1[i];
                    totel += removing * removeCost;
                } else if (stk1[i] > stk2[i]) {
                    int adding = stk1[i] - stk2[i];
                    totel += adding * addCost;
                }
            }
              System.out.println(totel);
        }
    }
}