// Make Leaderboard - Med Ended
// Description

// You are given name and marks of N different students in a hackerrank contest. Your task is to write a program that makes leaderboard of the students under following conditions:

// - If two students get same marks they get same rank

// - The student placed next to the same marks students will get the rank skipping the intermediate ranks.

// Refer to the sample test case for better understanding.

// Input
// Input Format :
// First line of input contains N

// Next N line contains name and marks respectively of N different students (where name and marks is separated by a space)

// Constraints :

// 1 <= N <= 10^5

// 1 <= len(name) <= 10

// 1 <= Marks <= 10^5

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

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            students[i] = new Student(name, marks, 0);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.marks == b.marks) {
                return a.name.compareTo(b.name);
            } else {
                return Integer.compare(b.marks, a.marks);
            }
        });

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students[i].marks == students[i - 1].marks) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = rank;
            }
            rank++;
        }

        for (Student student : students) {
            System.out.println(student.rank + " " + student.name);
        }
    }

    static class Student {
        String name;
        int marks;
        int rank;

        public Student(String name, int marks, int rank) {
            this.name = name;
            this.marks = marks;
            this.rank = rank;
        }
    }
}