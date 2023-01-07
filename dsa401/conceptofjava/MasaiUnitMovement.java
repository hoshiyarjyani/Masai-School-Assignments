// Masai Unit Movement -27:46:18
// Description

// You are given an interface with the name -unit_movement, containing the following functions
// 1. public String nextCourse(String current_course);
// 2. public boolean nextCourse(int current_course_marks);
// 3. public String nextCourse(int current_course_marks, String current_course);
// 4. public boolean terminated(int current_course_marks, boolean async);
// Another class -java_unit_movementimplements the above interface

// The logic for each of the function is explained below

// 1. public String nextCourse(String current_course);
// - This functions returns "SB101", if the value of current_course = "JA111"

// - This functions returns "SB201", if the value of the current_course = "SB101"

// - This function returns "Placements" if the value of the current_course = "RJ101"

// ** No other value will be passed as an argument to this function
// 2. public boolean nextCourse(int current_course_marks);
// - This function returns true if the value passed as parameter is greater than or equal to 5

// - Else this function returns false
// 3. public String nextCourse(int current_course_marks,String current_course)

// a. If the value of current_course = "JA111", then one of the following 2 conditions become true
//   - If the value of current_course_marks >= 5, then this function returns "SB101"
//   - If the value of current_course_marks < 5, then this function returns "JA111"

// b. If the value of current_course = "SB101", then one of the following 2 conditions become true
//   - If the value of current_course_marks >= 5, then this function returns "SB201"
//   - If the value of current_course_marks < 5, then this function returns "SB101"

// c. If the value of current_course = "SB201", then one of the following 2 conditions become true
//   - If the value of current_course_marks >= 5, then this function returns "RJ101"
//   - If the value of current_course_marks < 5, then this function returns "SB201"

// d. If the value of current_course = "RJ101", then one of the following 2 conditions become true
//   - If the value of current_course_marks >= 5, then this function returns "Placements"
//   - If the value of current_course_marks < 5, then this function returns "RJ101"

// ** No other value will be given to current_course

// public boolean terminated(int current_course_marks, boolean async)

// - This function returns false, if the value of async = false

// - If the value of async = true, then one of the following 2 conditions happen

//    1. If the value of current_course_marks < 5, this function returns true
//    2. If the value of current_course_marks >= 5, this function returns false

// Complete the class as according to the logic for the respective functions defined above

// Input
// You don't have to take the input or the output, just complete the class as mentioned above

// Output
// You don't have to take the input or the output, just complete the class as mentioned above

// Sample Input 1 

// current_course = JA111
// current_course_marks = 5
// async = false
// Sample Output 1

// Is the student getting terminated ->  false
// Based on the marks, is the student moving to the next course -> true
// Based on the current course, the next course for the student is -> SB101
// Based on marks & current_course, the next course for the student is ->  SB101

package conceptofjava;

/*
interface unitMovement{
    public String nextCourse(String current_course);
    public boolean nextCourse(int current_course_marks);
    public String nextCourse(int current_course_marks, String current_course);
    public boolean terminated(int current_course_marks, boolean async);
}
*/
class java_unit_movement implements unitMovement {
    // complete this class which implements the interface mentioned above
    public String nextCourse(String current_course) {
        if (current_course.equals("JA111")) {
            return "SB101";
        } else if (current_course.equals("SB101")) {
            return "SB201";
        } else if (current_course.equals("SB201")) {
            return "RJ101";
        } else if (current_course.equals("RJ101")) {
            return "Placements";
        }

        else {
            return "Invalid Course";
        }
    }

    public boolean nextCourse(int current_course_marks) {
        if (current_course_marks >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public String nextCourse(int current_course_marks, String current_course) {
        if (current_course.equals("JA111")) {
            if (current_course_marks >= 5) {
                return "SB101";
            } else {
                return "JA111";
            }
        } else if (current_course.equals("SB101")) {
            if (current_course_marks >= 5) {
                return "SB201";
            } else {
                return "SB101";
            }
        } else if (current_course.equals("SB201")) {
            if (current_course_marks >= 5) {
                return "RJ101";
            } else {
                return "SB201";
            }
        } else if (current_course.equals("RJ101")) {
            if (current_course_marks >= 5) {
                return "Placements";
            } else {
                return "RJ101";
            }
        } else {
            return "Invalid Course";
        }
    }

    public boolean terminated(int current_course_marks, boolean async) {
        if (current_course_marks < 5 && async) {
            return true;
        } else {
            return false;
        }
    }
}