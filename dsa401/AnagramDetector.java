// Anagram Detector! Ended
// Description

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram.

// Given 2 phrases, write a program that detects if both are anagrams of each other.

// If both are anagrams, print "True"

// Else print "False"

// Input
// Input Format :

// First line of input contains first phrase

// Second line of input contains second phrase

// Constraints :

// Length of each phrase < 1000

// Output
// Output a string based on conditions mentioned above

// Sample Input 1 

// anagram
// nag a ram
// Sample Output 1

// True

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] first = str1.replaceAll("[\\s]", "").toCharArray();
        char[] sec = str2.replaceAll("[\\s]", "").toCharArray();
        java.util.Arrays.sort(first);
        java.util.Arrays.sort(sec);
        if (java.util.Arrays.equals(first, sec)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}