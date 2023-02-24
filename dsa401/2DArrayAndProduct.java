// 2D Array and Product
// Description

// You are given an array of n rows, m columns which contains positive integers and  product P

// You need to find occurrences of the product of three consecutive numbers (i.e x,y, and z )whose product is equal to given P appear horizontally, vertically and diagonally in the given matrix.

// Input
// Input Format

// First line: Three integers n, m and P where n denotes the number of rows, m denotes the number of columns in the matrix and P is the product.

// Next line: Each line contains m characters which contain positive integers only.

// Constraints

// 1< = n,m < 10

// 1<= P <=100

// Output
// Print the number of times the product p appears in the matrix

// Sample Input 1 

// 3 3 6
// 3 2 1
// 2 2 2
// 1 5 1
// Sample Output 1

// 3
// Hint

// Sample 1 Explanation

// The product P 6 presents 3 times in the matrix(1 Horizontal +1 Vertical + 1 Diagonal)

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // Check horizontally
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (arr[i][j] * arr[i][j + 1] * arr[i][j + 2] == p) {
                    count++;
                }
            }
        }

        // Check vertically
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] * arr[i + 1][j] * arr[i + 2][j] == p) {
                    count++;
                }
            }
        }

        // Check diagonally (from top left to bottom right)
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (arr[i][j] * arr[i + 1][j + 1] * arr[i + 2][j + 2] == p) {
                    count++;
                }
            }
        }

        // Check diagonally (from top right to bottom left)
        for (int i = 0; i < n - 2; i++) {
            for (int j = 2; j < m; j++) {
                if (arr[i][j] * arr[i + 1][j - 1] * arr[i + 2][j - 2] == p) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


// =====================IN JavaScript==========================================

// function twoArrayAndProduct(n, m, arr, p){
//     //write code here
//   let count = 0;
  
//  // Check horizontally
//   for (let i = 0; i < n; i++) {
//     for (let j = 0; j < m - 2; j++) {
//       if (arr[i][j] * arr[i][j + 1] * arr[i][j + 2] === p) {
//         count++;
//       }
//     }
//   }
  
//   // Check vertically
//   for (let i = 0; i < n - 2; i++) {
//     for (let j = 0; j < m; j++) {
//       if (arr[i][j] * arr[i + 1][j] * arr[i + 2][j] === p) {
//         count++;
//       }
//     }
//   }
//    // Check diagonally (from top left to bottom right)
//   for (let i = 0; i < n - 2; i++) {
//     for (let j = 0; j < m - 2; j++) {
//       if (arr[i][j] * arr[i + 1][j + 1] * arr[i + 2][j + 2] === p) {
//         count++;
//       }
//     }
//   }
  
//    // Check diagonally (from top right to bottom left)
//   for (let i = 0; i < n - 2; i++) {
//     for (let j = 2; j < m; j++) {
//       if (arr[i][j] * arr[i + 1][j - 1] * arr[i + 2][j - 2] === p) {
//         count++;
//       }
//     }
//   }

//   console.log(count);
// }


  

          
          