// Time taken Ended
// Description

// There are n people in a line to buy tickets for a movie.

// The ith (1<=i<=n) person in the line wants to buy a total oftickets[i]tickets.

// At each step the person at the front of the queue can buy 1 ticket and this takes 1 second of time.

// If they need more tickets, they go to the back of the queue again, this happens instantly and does not take any extra time, and this process is repeated until everyone can buy all the tickets they need.

// You are given an indexkand you have to tell the total time it takes for the kth person to buy all the tickets they need.

// Input
// Input Format
// The first line of input contains two integers n and k - the size of the tickets queue and the index of the person whose total time taken you have to output.

// The second line contains n space-separated integers, the ith of which is the number of tickets required by the ith person.

// Constraints
// 1 <= n <= 10^5

// 1 <= k <= n

// 1 <= tickets[i] <= 100

// Output
// Output Format
// Print the time taken for the person at position k to finish buying tickets.

// Sample Input 1 

// 4 1
// 5 1 1 1
// Sample Output 1

// 8
// Hint

// In the first pass, everyone in the line buys a ticket and the line becomes [4].

// In the next 4 passes, only the person in position 1 is buying tickets.

// The person at position 0 has successfully bought 5 tickets and it took 4 + 1 + 1 + 1 + 1 = 8 seconds.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() - 1;

        int arr[] = new int[n];
        // arr[5] = {5 6 2 3 4}

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        while (arr[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    count++;
                    arr[i] = arr[i] - 1;
                    if (arr[k] == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}