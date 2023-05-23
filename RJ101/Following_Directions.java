import java.util.*;

class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int i = 0;
            int j = 0;
            String res = "NO";
            for (int m = 0; m < n; m++) {
                if (str.charAt(m) == 'U') {
                    j++;
                } else if (str.charAt(m) == 'D') {
                    j--;
                } else if (str.charAt(m) == 'R') {
                    i++;
                } else if (str.charAt(m) == 'L') {
                    i--;
                }
                if (i == 1 && j == 1) {
                    res = "YES";
                    break;
                }
            }
            System.out.println(res);

        }
    }
}

// Input

// 7
// 7
// UUURDDL
// 2
// UR
// 8
// RRRUUDDD
// 3
// LLL
// 4
// DUUR
// 5
// RUDLL
// 11
// LLLLDDRUDRD


// Output

// YES
// YES
// NO
// NO
// YES
// YES
// NO