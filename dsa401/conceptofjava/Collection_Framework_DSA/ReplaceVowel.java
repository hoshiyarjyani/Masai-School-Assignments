// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();
//         input.nextLine();
//         String str = input.nextLine();

//         String modifiedString = str.replaceAll("[aeiou]", "*");
//         System.out.println(modifiedString);
//     }
// }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                modifiedString.append("*");
            } else {
                modifiedString.append(c);
            }
        }
        System.out.println(modifiedString);
    }
}
