// Password Detection 
// Description

// You are given an abstract class with the name -passwordDetection

// Another class -checkerextends the above class

// It accepts an integer stored in a variable with the name -size. This value is passed to the class via constructor, you have to write the constructor for the same

// Apart from this, the class inherits the following functions from the parent class, the logic for which is as follows

// 1. checkLength(String password) - This function returns true if the length of the password is greater than or
// equal to the value passed to the constructor and stored in the variable "size", else returns false

// 2. checkSpecialCharacter(String password) - This function returns true if the password contains at least one of the 
// following special characters - [@,#,$,&,*], else returns false

// 3. checkNumber(String password) - This function returns true if the password contains at least one integer from the following 
// range - [0,9], else returns false

// 4. checkLowerCase(String password) - This function returns true if the password contains 
// at least one character from the following range - [a,z], else returns false

// 5. checkUpperCase - This function returns true if the password contains at least one character from the following
// range - [A,Z], else returns false
// Complete the class, as mentioned above. Please note, the class contains a constructor which accepts an integer, the value stored in the variable size

// Input
// You don't have to take the input or the output. Just complete the class, as mentioned in the problem statement

// Output
// You don't have to take the input or the output. Just complete the class, as mentioned in the problem statement

// Sample Input 1 

// @manV123
// @albertsebastian123
// Sample Output 1

// Password Accepted
// Hint

// In the sample test case, assume the value stored in size = 5

// In the sample test case, the first password is accepted, as it satisfied all the requirements for a valid password

// In the second sample test case, the password is not accepted, as it does not satisfy all the requirements of a valid password

package conceptofjava;

/*
abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}
*/
class checker extends passwordDetector {
    // complete the class as mentioned in the problem statement
    int size;

    checker(int size) {
        this.size = size;
    }

    boolean checkLength(String password) {
        return password.length() >= size;
    }

    boolean checkSpecialCharacter(String password) {
        String specialCharacters = "[@,#,$,&,*]";
        for (char c : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

    boolean checkNumber(String password) {
        for (char c : password.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    boolean checkLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    boolean checkUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }

}
