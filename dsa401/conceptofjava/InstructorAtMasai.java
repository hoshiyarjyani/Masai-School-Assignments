// Instructors at Masai
// Description

// You are given an Interface with the nameInstructor, containing the following functions
// 1. topic()
// 2. evaluation()
// 3. constructWeek()
// 4. instructorName()
// Another class with the namedsaimplements the above interface, such that
// 1. topic() - This function returns the string - "Data Structures & Algorithms"

// 2. evaluation() - This function returns an integer 2 indicating the value of the DSA Evaluation 

// 3. constructWeek() - This function returns false, as there is no project during construct week

// 4. instructorName() - This function takes in one of the following parameters

// a. DSA101 
// b. DSA201
// c. DSA301
// d. DSA401

// - If the argument passed is DSA101, return "Varun Bhatt"
// - If the argument passed is DSA201, return "Venugopal Panchamurthi"
// - If the argument passed is DSA301, return "Aishwarya Shivachandran"
// - If the argument passed is DSA401, return "Akshay Gupta"
// Similarly, another class with the namedsaimplements the above interface, such that
// 1. topic() - This function returns the string - "Java & Spring boot"

// 2. evaluation() - This function returns an integer 3 indicating the value of the Coding Evaluation 

// 3. constructWeek() - This function returns true, as there is a project during construct week

// 4. instructorName() - This function takes in one of the following parameters

// a. JA111
// b. SB101
// c. SB201
// d. RJ101

// - If the argument passed is JA111, return "Ratan Lal Gupta"
// - If the argument passed is SB101, return "Arjun Thakur"
// - If the argument passed is SB201, return "Ratan Lal Gupta"
// - If the argument passed is RJ101, return "Varun Bhatt"

// Input
// You don't have to take the input or the output, just implement the classes mentioned in the problem statement accordingly

// Output
// - You don't have to take the input or the output, just implement the classes mentioned in the problem statement accordingly

// Sample Input 1 

// NA
// Sample Output 1

// NA

package conceptofjava;

interface Instructor {
  String topic();
  int evaluation();
  boolean constructWeek();
  String instructorName(String course);
}

class dsa implements Instructor {
    public String topic() {
        return "Data Structures & Algorithms";
    }

    public int evaluation() {
        return 2;
    }

    public boolean constructWeek() {
        return false;
    }

    public String instructorName(String course) {
        if (course.equals("DSA101")) {
            return "Varun Bhatt";
        } else if (course.equals("DSA201")) {
            return "Venugopal Panchamurthi";
        } else if (course.equals("DSA301")) {
            return "Aishwarya Shivachandran";
        } else if (course.equals("DSA401")) {
            return "Akshay Gupta";
        } else {
            return "Invalid course";
        }
    }
}

class coding implements Instructor {
    public String topic() {
        return "Java & Spring boot";
    }

    public int evaluation() {
        return 3;
    }

    public boolean constructWeek() {
        return true;
    }

    public String instructorName(String course) {
        if (course.equals("JA111")) {
            return "Ratan Lal Gupta";
        } else if (course.equals("SB101")) {
            return "Arjun Thakur";
        } else if (course.equals("SB201")) {
            return "Ratan Lal Gupta";
        } else if (course.equals("RJ101")) {
            return "Varun Bhatt";
        } else {
            return "Invalid course";
        }
    }
}
