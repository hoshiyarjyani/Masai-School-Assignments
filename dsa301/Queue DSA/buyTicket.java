import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int x = 0;
        int y = 0;
        int count = 0;
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int tc = Integer.parseInt(input);
        
        for (int i = 0; i < tc; i++) {
            input = scanner.nextLine();
            String[] strArr = input.split(" ");
            
            if (strArr.length == 2) {
                int d = Integer.parseInt(strArr[1]);
                arr.add(x, d);
                x++;
                count++;
                System.out.println(count);
            } else {
                if (count == 0) {
                    System.out.println("-1 0");
                } else {
                    count--;
                    System.out.println(arr.get(y) + " " + count);
                    y++;
                }
            }
        }
    }
}
