// Substring under condition -31:15:11
// Description

// You are given a strings, you have to find thecountof all such substrings which start and ends with the same character.


// Input
// Input Format :

// First and the only line contains a strings

// Constraints:

// 1 <= Length of s <= 1000


// Output
// Print the count of total number of such substrings starting and ending with same characters.


// Sample Input 1 

// abcab
// Sample Output 1

// 7
// Hint

// Substrings ofabcabwhich start and end with same characters, area,abca,b,bcab,c,a,b.

// So total count is 7. Hence we print 7.

// Language: 
 import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i = 0; i<str.length();i++){
            String s = "";
            for(int j = i;j<str.length();j++){
                s+=str.charAt(j);
                if(s.charAt(0)==s.charAt(s.length()-1)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}