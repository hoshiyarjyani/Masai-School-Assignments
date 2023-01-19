// Doctor's Appointment -0:8:30
// Description

// You have a terrible toothache, so you went to book an appointment to see your doctor. When you reach there you notice that there are no seats and everyone's standing.
// The doctor's assistant is pretty strict, so she doesn't allow anyone inside the cabin until it's his turn. People are standing in a random order so she passes each person to check if he's next, when she finds the one she takes him with her. Meanwhile, nobody is allowed to exchange places, when she comes back she repeats the process from the front of the line. She takes one move to move from one person to another. You have to find the total number of moves she used to completely clear the queue.

// Note-when she finds the person and takes him with her during that no move is counted.

// Input
// The First Line contains the number (n) of persons in the queue.

// The Second line contains n evenly spaced integers which represent the names of people according to the list the assistant has.

// The Third line again contains n evenly spaced integers which represent the names of people as they are standing in the queue

// Output
// You have to output a single number which is the total number of moves she requires.

// Sample Input 1 

// 4
// 1 2 3 4
// 4 2 3 1
// Sample Output 1

// 8
// Hint

// She goes firstly to Mr. "4" (Move-1) and since "1" is the next person in her list she continues forward. Similarly, she passes "2" and "3" (Move-2 and Move-3), then she goes to "1" (Move-4) and since he's next she takes him with her. When she comes back she again starts with "4" (Move-5) and since "2" is the next person she moves forward (Move-6), and so on.

// Language: 

// Theme: 
// Font Size: 10

//   
//    Test against custom input
// Status  Accepted
// Masai School

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int[] queue = new int[n];
        for (int i = 0; i < n; i++) {
            queue[i] = sc.nextInt();
        }

        int moves = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list[i] == queue[j]) {
                    moves++;
                    queue[j] = 0;
                    break;
                } else if (queue[j] == 0) {
                    continue;
                }
                moves++;
            }
        }

        System.out.println(moves - 1);
    }
}
