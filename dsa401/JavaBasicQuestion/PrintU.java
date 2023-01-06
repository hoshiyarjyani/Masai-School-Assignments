package JavaBasicQuestion;

// *       *
// *       *
// *       *
// *       *
// * * * * *
public class PrintU {
    public static void patternPrinting(int n) {
        // write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else if (i == n - 1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
