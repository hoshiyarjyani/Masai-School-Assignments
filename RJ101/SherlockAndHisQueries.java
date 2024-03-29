Sherlock and his queries

Description Sherlock has a matrix of dimension[nxm].All the elements in this matrix are zero(Initialised as 0).Sherlock has q queries to execute on the matrix.Each query has two integers i.e,the type of query and the index.So if the type is 0,the index represents the index of row.Similarly,if the type is 1,the index represents the index of the column.Sherlock has to increase the value by 1 of all the elements that are present in that row or column depending on the type and index.In the end,after executing all queries,Sherlock is curious and wants to find the number of elements of the matrix which are odd(not divisible by 2).Note-O-based indexing is followed here.

Input The first line of the input contains one integer t(1 st≤10)-the number of test cases.Then t test cases follow The first line of each test case contains two integers n,m(1≤n≤1000,1 s m s1000)-the number of rows and columns,respectively.The second line of each test case contains a single integer q(1≤q≤100000)-the number of queries.The next q lines of each test case contain 2 integers type and index(0≤type≤1,0≤index≤n-1(for row)and m-1(for col))-the info on the query.

Output For each test case,print the answer:The number of elements of the matrix which are odd.

Sample Input
2
2 2 
4
0 1
0 0
0 0
1 1
4 4
10
0 1
0 2
0 0
0 1
0 1
0 1
1 1
1 1
1 3
1 0

Sample Output
2
8



//  1st Approch

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();  
        for (int i = 0; i < tc; i++) {
            int r = sc.nextInt();  
            int c = sc.nextInt();  

            int[] rowCount = new int[r]; // Track row increments
            int[] colCount = new int[c]; // Track column increments

            int q = sc.nextInt();  
            for (int j = 0; j < q; j++) {
                int type = sc.nextInt();
                int index = sc.nextInt();

                if (type == 0) {
                    rowCount[index]++; // Increment row count
                } else {
                    colCount[index]++; // Increment column count
                }
            }

            int oddCount = 0;  

            // Calculate odd elements based on row and column increments
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    int totalIncrements = rowCount[j] + colCount[k];
                    if (totalIncrements % 2 != 0) {
                        oddCount++;
                    }
                }
            }

            System.out.println(oddCount);
        }
    }
}




// 2nd Approch

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            int q = sc.nextInt();

            int[] rowCounts = new int[n]; // Track row counts
            int[] colCounts = new int[m]; // Track column counts

            for (int j = 0; j < q; j++) {
                int type = sc.nextInt();
                int index = sc.nextInt();

                if (type == 0) {
                    // Update row count
                    rowCounts[index]++;
                } else {
                    // Update column count
                    colCounts[index]++;
                }
            }

            int oddCount = 0;

            // Count odd elements based on row and column counts
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    matrix[j][k] = rowCounts[j] + colCounts[k];
                    if (matrix[j][k] % 2 != 0) {
                        oddCount++;
                    }
                }
            }

            System.out.println(oddCount);
        }
    }
}


// 3rd Approch - But TLE

import java.util.Scanner;

public class SherlockAndQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of rows
            int m = sc.nextInt(); // Number of columns
            int[][] matrix = new int[n][m]; // Matrix

            int q = sc.nextInt(); // Number of queries

            // Execute queries
            for (int j = 0; j < q; j++) {
                int type = sc.nextInt();
                int index = sc.nextInt();

                if (type == 0) {
                    // Update row elements
                    for (int k = 0; k < m; k++) {
                        matrix[index][k]++;
                    }
                } else {
                    // Update column elements
                    for (int k = 0; k < n; k++) {
                        matrix[k][index]++;
                    }
                }
            }

            int oddCount = 0; // Count of odd elements

            // Count odd elements
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (matrix[j][k] % 2 != 0) {
                        oddCount++;
                    }
                }
            }

            System.out.println(oddCount);
        }
 
    }
}



https://oj.masaischool.com/contest/5870/problem/02