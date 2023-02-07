// Class for sorting Ended
// Description

// You are given a class with the namesorter_class, which contains the following functions
// sort(String[] arr) - This function takes a string array and sorts it in lexicographic order (dictionary order)

// sort(int[] arr) - This function taken an integer array, and sorts it in ascending order

// sort(char[] arr) - This function takes a character array, and sorts it in alphabetical order
// The array may contain upper and small characters both. In that case, upper characters are given 
// higher precedence compared to the small case characters

// sort(boolean[] arr) - This function takes a boolean array, and sorts it such that true value comes first, 
// followed by the false values
// You have to complete the above functions for the class
// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement

// Input
// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement

// Output
// There is no need to take the input or the output. Just complete the class as mentioned in the problem statement

// Sample Input 1 

// NA
// Sample Output 1

// NA

import java.util.*;

class sorter_class {
    // complete the class as mentioned in the problem statemenent above
    void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(boolean[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] == false && arr[j + 1] == true) {
                    boolean temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

