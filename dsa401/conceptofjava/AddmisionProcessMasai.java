// Admission Process at Masai Ended
// Description

// You are designing the backend system for the Masai School Admission process for the various courses

// You have to design an abstract class containing the following abstract functions

// 1. boolean ageLimit(int age);
// 2. boolean educationCriteria(boolean plusTwo);
// 3. boolean creditScore(int score);
// 4. boolean nationality(String citizen);
// The following classes extend the above given abstract class
// intensiveProgram()
// 1. The candidate should be above 18 years of age, and below 28 years of age
// 2. The candidate should have done +2 (Passed 12th standard)
// 3. The credit score should be 750 or above
// 4. The nationality of the candidate must be Indian
// The class will have the following attributes
// 1. int age
// 2. boolean plusTwo
// 3. int creditScore
// 4. String citizen
// The following two constructors have to be implemented
// 1. intensiveProgram(int age, boolean plusTwo,String citizen,int creditScore)
// 2. intensiveProgram(int age, boolean plusTwo, String citizen)

// ** If the value of creditScore is not provided by the constructor, the default value will be 750
// You will have to implement the classes extended by the abstract class, and add the following function
// String finalDecision()
// - This function returns the following statement if all the criteria are met

// "You are eligible for the Intensive Program"

// - Else, the following string is returned

// "You are not eligible for the Intensive Program"
// The following classes extend the above given abstract class
// xProgram()
// 1. The candidate should be above 18 years of age, and below 35 years of age
// 2. The candidate should have done +2 (Passed 12th standard)
// 3. The credit score should be 750 or above
// 4. The nationality of the candidate must be Indian, or American
// 5. The candidate must have 2 or more years of working experience
// The class will have the following attributes
// 1. int age
// 2. boolean plusTwo
// 3. int creditScore
// 4. String citizen
// 5. int yearsOfExperience
// The following two constructors have to be implemented
// 1. xProgram(int age, boolean plusTwo,  String citizen, int creditScore,int yearsOfExperience)
// 2. xProgram(int age, boolean plusTwo, String citizen, int yearsOfExperience)

// ** If the value of creditScore is not provided by the constructor, the default value will be 750
// You will have to implement the classes extended by the abstract class, and add the following functions
// boolean experience()
// - This function returns true if the experience is more than or equal to 2, else returns false

// String finalDecision()
// - This function returns the following statement if all the criteria are met

// "You are eligible for the X Program"

// - Else, the following string is returned

// "You are not eligible for the X Program"
// There's no need to take the input or the output. Just complete the classes as mentioned in the problem statement above

// Input
// There's no need to take the input or the output. Just complete the classes as mentioned in the problem statement above

// Output
// There's no need to take the input or the output. Just complete the classes as mentioned in the problem statement above

// Sample Input 1 

// NA
// Sample Output 1

// NA

abstract class admissionProcess {
    // write the abstract class as mentioned in the problem statement above
    int age;
    boolean plusTwo;
    int creditScore;
    String citizen;

    admissionProcess(int age, boolean plusTwo, String citizen, int creditScore) {
        this.age = age;
        this.plusTwo = plusTwo;
        this.creditScore = creditScore;
        this.citizen = citizen;
    }

    admissionProcess(int age, boolean plusTwo, String citizen) {
        this(age, plusTwo, citizen, 750);
    }

    abstract boolean ageLimit(int age);

    abstract boolean educationCriteria(boolean plusTwo);

    abstract boolean creditScore(int score);

    abstract boolean nationality(String citizen);
}

class intensiveProgram extends admissionProcess {
    // write the class as mentioned in the problem statement above
    intensiveProgram(int age, boolean plusTwo, String citizen, int creditScore) {
        super(age, plusTwo, citizen, creditScore);
    }

    intensiveProgram(int age, boolean plusTwo, String citizen) {
        this(age, plusTwo, citizen, 750);

    }

    boolean ageLimit(int age) {
        if (age > 18 && age < 28) {
            return true;
        } else {
            return false;
        }
    };

    boolean educationCriteria(boolean plusTwo) {
        if (plusTwo) {
            return true;
        } else {
            return false;
        }
    };

    boolean creditScore(int score) {
        if (creditScore >= 750) {
            return true;
        } else {
            return false;
        }
    };

    boolean nationality(String citizen) {
        if (citizen == "Indian") {
            return true;
        } else {
            return false;
        }
    };

    String finalDecision() {
        if ((age > 18 && age < 28) && plusTwo && creditScore >= 750 && citizen == "Indian") {
            String x = "You are eligible for the Intensive Program";

            return x;
        } else {
            String y = "You are not eligible for the Intensive Program";
            return y;
        }
    }
}

class xProgram extends admissionProcess {
    int yearsOfExperience;

    xProgram(int age, boolean plusTwo, String citizen, int creditScore, int yearsOfExperience) {
        super(age, plusTwo, citizen, creditScore);
        this.yearsOfExperience = yearsOfExperience;
    }

    xProgram(int age, boolean plusTwo, String citizen, int yearsOfExperience) {
        super(age, plusTwo, citizen,750);
        this.yearsOfExperience = yearsOfExperience;
    }

    boolean ageLimit(int age) {
        if (age > 18 && age < 35) {
            return true;
        } else {
            return false;
        }
    }

    boolean educationCriteria(boolean plusTwo) {
        if (plusTwo) {
            return true;
        } else {
            return false;
        }
    }

    boolean creditScore(int score) {
        if (creditScore >= 750) {
            return true;
        } else {
            return false;
        }
    }

    boolean nationality(String citizen) {
        if (citizen == "Indian" || citizen == "American") {
            return true;
        } else {
            return false;
        }
    }

    boolean experience() {
        if (yearsOfExperience >= 2) {
            return true;
        } else {
            return false;
        }
    }

    String finalDecision() {
        if ((age > 18 && age < 35) && plusTwo && creditScore >= 750 && (citizen == "Indian" || citizen == "American")
                && yearsOfExperience >= 2) {
            String u = "You are eligible for the X Program";
            return u;
        } else {
            String c = "You are not eligible for the X Program";
            return c;
        }
    }
}
//important concept