// Edible Plants 
// Description

// Chunnu and Munnu have gone hiking and they have a shortage of food supplies. So, they want your help to figure out which plants are edible and which are not. You are given a stringediblerepresenting the types of plants that are edible, and another stringplantsrepresenting all plants that are on the trail. Your task is to find out how many plants are there on the trail which are edible.

// Note:Letters are case sensitive, so"a"is considered a different type of plant from"A".

// Input
// Input

// First line representsN, length ofediblestring
// Second line represents theediblestring
// Third line representsM, length ofplantsstring
// Fourth line represents theplantstring
// Constraints

// 1 <= N, M <= 1000

// Output
// Output the count of plants that are edible

// Sample Input 1 

// 2
// xY
// 6
// AYxxXY
// Sample Output 1

// 4
// Sample Input 2 

// 3
// abc
// 6
// ABCxyz
// Sample Output 2

// 0
// Hint

// In Sample1,

// N=2,edible="xY",M=6,plants="AYxxXY"
// In theplantsstring there are 4 characters(2 "x"'s and 2 "Y"'s)that are there in theediblestring.
// Hence, the output is4
// In Sample2,

// N=3,edible="abc",M=6,plants="ABCxyz"
// In theplantsstring there are no characters that match withediblestring.
// Hence, the output is 0

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String edible = sc.next();
        int m = sc.nextInt();
        String plants = sc.next();

        int count = countEdiblePlants(edible, plants);
        System.out.println(count);
    }

    public static int countEdiblePlants(String edible, String plants) {
        HashSet<Character> set = new HashSet<>();
        for (char c : edible.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        for (char c : plants.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
