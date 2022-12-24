public class PattrenOf1toNprint {
    public static void patternOfN(int num){
        //write your code here
        int k = 1;
        for(int i = 1;i<=num;i++){
            for(int j =1;j<=num;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
      }
public static void main(String[] args) {
    patternOfN(15);
}    
}

// Pattern of N -26:58:50
// Description

// You are given a number stored in a variable with the nameN

// You have to print all the numbers in the range from1 to N*N, such that there are exactlyNnumbers on each line

// For example, if the value stored inN = 3, then all the numbers in the range, from [1,9] need to be printed, such that there are 3 numbers on each line. Therefore, the required output is

// 1 2 3
// 4 5 6
// 7 8 9

// Input
// The first and the only line of the input contains the value stored in the variableN


// Output
// Print all the numbers in the range from [1, N*N], as shown in the problem statement, such that there areNnumbers on each line


// Sample Input 1 

// 4
// Sample Output 1

// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16 
// Hint

// In the sample test case, the value stored atN = 4. Therefore, all the values in the range from[1,16]need to be printed.

// Also, there should be 4 elements on each line. Therefore, the output becomes

// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Language: 
  
// Theme: 
// Font Size: 20


//   
//    Test against custom input
// Status  Accepted


