// Ransom note Ended
// Description

// Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

// Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

// Input
// Input Format
// The first line contains two space-separated integers,nandm, the numbers of words in themagazineand thenote, respectively.

// The second line containsnspace-separated strings, eachmagazine[i].

// The third line containsmspace-separated strings, eachnote[i].

// Constraints
// 1 <= n,m <= 30000

// 1 <= length of magazine[i] <= 5

// 1 <= length of note[i] <= 5

// Each word consists of english alphabetic letters (i.e a to z and A to Z)

// Output
// Output Format
// Print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

// Sample Input 1 

// 6 4
// give me one grand today night
// give one grand today
// Sample Output 1

// Yes
// Sample Input 2 

// 6 5
// two times three is not four
// two times two is four
// Sample Output 2

// No
// Hint

// First testcase
// All words in the note occur in the magazine

// Second testcase
// 'two' only occurs once in the magazine

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] magazine = new String[n];
        for (int i = 0; i < n; i++) {
            magazine[i] = sc.next();
        }
        String[] note = new String[m];
        for (int i = 0; i < m; i++) {
            note[i] = sc.next();
        }

        // use a hashmap to store the count of each word in the magazine
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : magazine) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        // check if each word in the note can be found in the magazine
        boolean canReplicate = true;
        for (String s : note) {
            if (!map.containsKey(s) || map.get(s) <= 0) {
                canReplicate = false;
                break;
            } else {
                map.put(s, map.get(s) - 1);
            }
        }

        if (canReplicate) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
