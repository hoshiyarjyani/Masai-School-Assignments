// Encrypt It -21:4:8
// Description

// Encryption is the process of converting a plaintext message into ciphertext which can be decoded back into the original message. An encryption algorithm along with a key is used in the encryption and decryption of data. There are several types of data encryptions which form the basis of network security. Encryption schemes are based on block or stream ciphers.

// Today, your task is to encrypt and print the encrypted string. You will be given a single line which contains alphabets, numbers and symbols, followed by a number K. You need to encrypt it in a way such that every character in the string is rotated by the given fixed number K.

// Only encrypt Alphabets and Numbers. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, should remain unencrypted.

// Look at the sample test case for better understanding.

// Input
// Input Format

// First line of input contains a single line of string 'S'

// Second line contains the number, encrypt key  K

// Constraints

// S contains alpha, numeric and symbols

// 0<=N<=1000

// Output
// Print the encrypted string.

// Sample Input 1 

// All-convoYs-9-be:Alert1.
// 4
// Sample Output 1

// Epp-gsrzsCw-3-fi:Epivx5.
// Hint

// Sample 1 Explanation

// A becomes E, Y becomes C, 9 becomes 3,

// -, . unchanged.

package conceptofjava;

import java.util.Scanner;

public class EncryptIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {

                if (Character.isLowerCase(c)) {
                    sb.append((char) ('a' + (c - 'a' + k) % 26));
                    // sb.append((char) ((c - 'a' + k) % 26 + 'a'));
                } else if (Character.isUpperCase(c)) {
                    sb.append((char) ('A' + (c - 'A' + k) % 26));
                    // sb.append((char) ((c - 'A' + k) % 26 + 'A'));
                } else {
                    sb.append((char) ('0' + (c - '0' + k) % 10));
                    // sb.append((char) ((c - '0' + k) % 10 + '0'));
                }
            } else {

                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
