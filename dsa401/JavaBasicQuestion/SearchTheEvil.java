// Search the evil -0:10:29
// Description

// Christmas is around the corner, and the famous American paranormal investors, Ed and Lorraine Warren, are trying to clean their house. Because of their job, they have collected a lot of objects, which have the influence of a cruel soul in someway or another. Since, they are going to have a Christmas party at their house, they have decided to get rid of all the evil objects. They have given an integer ID to all the objects, and had kept them, in a matrix grid of size N X M.

// The grid has been protected by a special charm, such that the entire grid is sorted row wise, and column wise.

// They found all the objects, except for one object with ID "K". Since, they have to make arrangements for the party, they ask you to check, if the object with ID "K", can be found or not.

// Print "true", if the object can be found, else print "false".

// Note : Multiple objects may have the same ID.

// Expected Time Complexity -O (N + M)

// Input
// The first line contains T, the number of test cases. First line of each test case contains N, M, the number of rows, and the number of columns in the grid.

// Each of the next N lines contain M space separated integers, denoting the IDs of the objects.

// The last line of each test case contains K, the object to be searched.

// Constraints

// 1 <= T <= 5

// 1 <= N, M <= 300

// 1 <= grid[i][j] <= 10^9

// 1 <= K <= 10^9

// Output
// For each test case, print true if the object is found, else print false, on a new line.

// Sample Input 1 

// 2
// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16 
// 13
// 4 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16 
// 17
// Sample Output 1

// true
// false
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            boolean flag = false;
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int k = sc.nextInt();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (k == arr[i][j]) {
                        flag = true;
                        break;
                    }
                }
            }

            System.out.println(flag);
            flag = false;
        }
    }
}