package conceptofjava;

// Comparison of Strings -27:14:16
// Description

// You are given an interface with the name -stringFunctions, containing the following functions
// 1. print(String a,String b) 
// 2. countOfVowels(String a,String b)
// 3. countOfConsonants(String a,String b)
// 4. valueOfString(String a,String b)
// The following two classes -strClassOneandstrClassTwo, implement the above interface, and complete the function according to the conditions mentioned in the comments

// You have to complete the functions, and return the values according to the required data type

// Input
// You don't have to take the input and the output, that is handled by the backend. Just complete the function, and return the data type according to the function

// Output
// You don't have to take the input and the output, that is handled by the backend. Just complete the function, and return the data type according to the function

// Sample Input 1 

// 4
// aman
// 6
// ankush
// Sample Output 1

// aman ankush
// aman
// ankush
// 6
// 4
// 6
// 4
/*
interface stringFunctions{
  public void print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
  public int valueOfString(String a,String b);
}
*/
// Please note that the string contains both uppercase and lowercase characters
class strClassOne implements stringFunctions {
    // implement all the function inherited by this class
    public String print(String a, String b) {
        // This function prints both the strings on the same line separated by space
        return a + " " + b;
    }

    public int countVowels(String a, String b) {
        // This function returns the length of the string having lesser number of
        // vowels.
        // In case both the strings, have the same number of vowels return the length of
        // the bigger string
        int aVowel = 0;
        int bVowel = 0;
        for (char c : a.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                aVowel++;
            }
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                bVowel++;
            }
        }
        if (aVowel < bVowel) {
            return a.length();
        } else if (aVowel > bVowel) {
            return b.length();
        } else {
            if (a.length() > b.length()) {
                return a.length();
            } else {
                return b.length();
            }
        }

    }

    public int countConsonants(String a, String b) {
        // This function returns the length of the string having lesser number of
        // consonants
        // In case both the strings have the same number of consonants, return the
        // length of the bigger string
        int aConst = 0;
        int bConst = 0;
        for (char c : a.toLowerCase().toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                aConst++;
            }
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                bConst++;
            }
        }
        if (aConst < bConst) {
            return a.length();
        } else if (aConst > bConst) {
            return b.length();
        } else {
            if (a.length() > b.length()) {
                return a.length();
            } else {
                return b.length();
            }
        }
    }
}

class strClassTwo implements stringFunctions {
    // implement all the function inherited by this class
    public String print(String a, String b) {
        // This functions prints string a and string b on two different lines
        return a + "\n" + b;
    }

    public int countVowels(String a, String b) {
        // This function returns the length of the string having more number of vowels.
        // In case both the strings, have the same number of vowels return the length of
        // the smaller string
        int aVowel = 0;
        int bVowel = 0;
        for (char c : a.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                aVowel++;
            }
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                bVowel++;
            }
        }
        if (aVowel < bVowel) {
            return b.length();
        } else if (aVowel > bVowel) {
            return a.length();
        } else {
            if (a.length() > b.length()) {
                return b.length();
            } else {
                return a.length();
            }
        }

    }

    public int countConsonants(String a, String b) {
        // This function returns the length of the string having more number of
        // consonants
        // In case both the strings have the same number of consonants, return the
        // length of the smaller string
        int aConst = 0;
        int bConst = 0;
        for (char c : a.toLowerCase().toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                aConst++;
            }
        }
        for (char c : b.toLowerCase().toCharArray()) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                bConst++;
            }
        }
        if (aConst < bConst) {
            return b.length();
        } else if (aConst > bConst) {
            return a.length();
        } else {
            if (a.length() > b.length()) {
                return b.length();
            } else {
                return a.length();
            }
        }

    }
}
