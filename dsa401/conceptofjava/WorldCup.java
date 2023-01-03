// T20 World Cup 2022 Ended
// Description

// You are creating the backend system to maintain the points table for the T20 world cup in Australia. To do so, you have to implement the following 2 classes

// The first class is called asPair, and contains the following attributes

// 1. String name
// 2. int points
// This class contains the following function
// void print() - This function prints the name and the points of a particular team in the format given below
// name + "->" + points
// The values will be passed through the constructor while creating the object. Implement the constructor for the class accordingly
// You have to implement another class called as worldCup, which contains the following attributes
// int numberOfTeams // The number of teams in a group;
// Pair[] arr; // All the names and the points of the team are stored in the Pair array
// The class contains the following functions
// void printLeaderBoard() 

// - This function prints the leaderboard such that the team with the most amount of points is printed first

// void sortList() - This function sorts the array in descending order, according to the points of each team

// ** You can assume that the points of each team are unique
// String[] qualified() - This function returns a string array, containing the names of the two teams which have the highest points

// ** The team with the highest scores should be printed first 
// String[] disqualified() - This functions returns the a string array, containing the name of the team which did not qualify

// ** Except for the top 2 teams, all the teams will be disqualified
// ** The team with the highest scores should be printed first 
// The values will be passed through the constructor while creating the object. Implement the constructor for the class accordingly
// You don't have to take the input or the output. Just complete the class as mentioned in the problem statement

// Input
// You don't have to take the input or the output. Just complete the class as mentioned in the problem statement

// Output
// You don't have to take the input or the output. Just complete the class as mentioned in the problem statement

// Sample Input 1 

// NZ 7
// ENG 8
// AUS 6
// AFG 0
// SL 4
// IRE 2
// RSA 5
// PAK 6
// IND 8
// ZIM 2
// NED 4
// BAN 0
// Sample Output 1

// Group 1 Leaderboard looks like ->
// ENG->8
// NZ->7
// AUS->6
// SL->4
// IRE->2
// AFG->0
// ----------
// Group 2 Leaderboard looks like ->
// IND->8
// PAK->6
// RSA->5
// NED->4
// ZIM->2
// BAN->0
// ----------
// The team qualified from group 1 are
// ENG
// NZ
// ----------
// The team qualified from group 2 are
// IND
// PAK
// ----------
// The team disqualified from group 1 are
// AUS
// SL
// IRE
// AFG
// ----------
// The team disqualified from group 2 are
// RSA
// NED
// ZIM
// BAN

import java.util.Arrays;

class Pair {
    String name;
    int points;

    public Pair(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void print() {
        System.out.println(name + "->" + points);
    }
}

class worldCup {
    int numberOfTeams;
    Pair[] arr;

    public worldCup(int numberOfTeams, Pair[] arr) {
        this.numberOfTeams = numberOfTeams;
        this.arr = arr;
    }

    public void printLeaderBoard() {

        sortList();

        for (Pair team : arr) {
            team.print();
        }
    }

    public void sortList() {
        Arrays.sort(arr, (a, b) -> b.points - a.points);
    }

    public String[] qualified() {

        sortList();

        return new String[] { arr[0].name, arr[1].name };
    }

    public String[] disqualified() {

        sortList();

        String[] disqualifiedTeams = new String[arr.length - 2];
        for (int i = 2; i < arr.length; i++) {
            disqualifiedTeams[i - 2] = arr[i].name;
        }
        return disqualifiedTeams;
    }

    public static void main(String[] args) {
        Pair team1 = new Pair("Australia", 10);
        Pair team2 = new Pair("India", 8);
        Pair team3 = new Pair("Pakistan", 7);
        Pair team4 = new Pair("England", 6);

        Pair[] teams = { team1, team2, team3, team4 };
        worldCup wc = new worldCup(4, teams);

        wc.printLeaderBoard();
        // prints:
        // Australia -> 10
        // India -> 8
        // Pakistan -> 7
        // England -> 6

        System.out.println(Arrays.toString(wc.qualified())); // prints ["Australia", "India"]
        System.out.println(Arrays.toString(wc.disqualified())); // prints ["Pakistan", "England"]

    }
}