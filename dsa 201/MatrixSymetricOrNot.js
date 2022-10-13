// Symmetric Or Not? -48:8:17
// Description

// You are given some matrices consist of only 0 's and  1's and you have to pick which are symmetric and which are not

// A matrix is said to be symmetric about X- axis if 1st row is identical to n-th row, 2nd is identical to (n-1)th  row and so on.

// A matrix is said to be symmetric about Y- axis if 1st column is identical to the nth column, 2nd identical to (n-1)th and so on for all columns.

// Your task is to print "YES" if it is symmetric about X-axis and Y-axis else "NO"


// Input
// Input Format :

// First line contains T - number of test cases.

// First line of each test case contains the n size of matrix.

// Next n lines contains n characters.

// Constraints :

// 1 ≤ T ≤ 10

// 2 ≤ N ≤ 32




// Output
// Print YES or NO in a new line for each test case .


// Sample Input 1 

// 5
// 2
// 11
// 11
// 4
// 0101
// 0110
// 0110
// 0101
// 4
// 1001
// 0000
// 0000
// 1001
// 5
// 01110
// 01010
// 10001
// 01010
// 01110
// 5
// 00100
// 01010
// 10001
// 01010
// 01110
// Sample Output 1

// YES
// NO
// YES
// YES
// NO
// Hint

// Output Explanation :

// Test Case 1: Symmetric about both axes, so YES.

// Test Case 2: Symmetric about X-axis but not symmetric about Y-axis, so NO.

// Test Case 3: Symmetric about both axes, so YES.

function symmetricOrNot(n, mat) {
    // write code here
    let flag = true;
    let half = Math.floor(n/2);
    for(let i = 0; i<=half;i++){
        for(let j = 0;j<half;j++){
            if(mat[i][j]!==mat[i][n-1-j]){
                flag = false;
               break;
            }
        }
    }
     for(let i = 0; i<=half;i++){
        for(let j = 0;j<=half;j++){
            if(mat[j][i]!==mat[n-1-j][i]){
                flag = false;
                break;
            }
        }
    }
    
    if(flag){
        console.log("YES");
    }   else{
        console.log("NO");
    }
}
