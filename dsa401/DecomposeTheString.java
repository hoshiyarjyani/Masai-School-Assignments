// Decompress the String Ended
// Description

// Given a string of lowercase characters and integers, decompress the string under the following rules:

// - If an integer is encountered, the character just before it gets added to a final string as many times as the number

// For instance, if the string is "a3b2" => the output should be "aaabb" because *a* is followed by 3, and *b* is followed by 2

// Write a program that decompresses the string based on rules above


// Input
// Input Format

// Input contains one string

// Constraints

// Length of string <= 100


// Output
// Output the decompressed string


// Sample Input 1 

// a3b2
// Sample Output 1

// aaabb



public static void decompressTheString(String a){
    //write your code here
     int n = a.length();
     StringBuilder sb = new StringBuilder(); 
     for(int i = 0; i<n;i++){
        char c = a.charAt(i);
         //System.out.println(c);
         if(Character.isLetter(c)){
             int j=i+1;
             while(j<n && Character.isDigit(a.charAt(j))){
                 j++;
             }
             int count = Integer.parseInt(a.substring(i+1,j));
             for(int k=0;k<count;k++){
                 sb.append(c);
             }
             i=j-1;
         }
     }
     System.out.println(sb);
  }