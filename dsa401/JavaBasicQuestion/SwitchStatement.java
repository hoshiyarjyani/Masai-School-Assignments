// Day of the Week 
// Description

// Given an integer N, output the name of the Day based upon the integer day number.

// e.g.: 0 - Sunday, 1- Monday, 6 - Saturday etc.

// Note: Use switch case to complete this problem

// Input
// The first line of input contain an integer N

// Output
// Output the name of the day based upon the day number, print the name of the day starting with first letter as a capital letter, e.g. Monday

// Sample Input 1 

// 3
// Sample Output 1

// Wednesday
// Sample Input 2 

// 5
// Sample Output 2

// Friday
// Hint

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;

        }

    }
}
