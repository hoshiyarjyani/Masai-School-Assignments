// Make Leaderboard Ended
// Description

// You are given name and marks of N different students in a hackerrank contest. Your task is to write a program that makes leaderboard of the students under following conditions:

// - If two students get same marks they get same rank

// - The student placed next to the same marks students will get the rank skipping the intermediate ranks.

// Refer to the sample test case for better understanding

// Note : You cannot use built-in sort function. Using that can lead to disqualification. Write your own sorting algorithm

// Input
// Input Format :
// First line of input contains N

// Next N line contains name and marks respectively of N different students (where name and marks is separated by a space)

// Constraints :

// N < 100

// Output
// Output N names with their rank. Follow these rules for generating the list:

// 1. The students having more mark gets better rank

// 2. If students have similar mark, their rank will be same(In case of similar marks, the person whose name comes first in alphabetical order comes first in order. However their rank will be same)

// 3. The student placed next to the same marks students will get the rank skipping the intermediate ranks.

// Sample Input 1 

// 6
// rancho 45
// chatur 32
// raju 30
// farhan 28
// virus 32
// joy 45
// Sample Output 1

// 1 joy
// 1 rancho
// 3 chatur
// 3 virus
// 5 raju
// 6 farhan

package conceptofjava;

import java.util.Scanner;

public class LeaderBoard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character

        // Create an array of Student objects
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            String name = line[0];
            int marks = Integer.parseInt(line[1]);
            students[i] = new Student(name, marks);
        }

        // Sort the array of students using a custom sorting algorithm
        sort(students);

        // Print the leaderboard
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students[i].marks != students[i - 1].marks) {
                rank = i + 1;
            }
            System.out.println(rank + " " + students[i].name);
        }
    }

    // Custom sorting algorithm to sort the array of students
    public static void sort(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].compareTo(students[j]) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}

// Student class to store name and marks of each student
class Student implements Comparable<Student> {
    public String name;
    public int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Compare two students based on their marks and names
    public int compareTo(Student other) {
        if (this.marks != other.marks) {
            return other.marks - this.marks;
        } else {
            return this.name.compareTo(other.name);
        }
    }
}
