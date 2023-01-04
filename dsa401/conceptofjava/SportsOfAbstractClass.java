// Sports of Abstract Classes Ended
// Description

// You are given an abstract class, having the following abstract methods
// 1. boolean indoor() - This returns true if the sport is indoor, else returns false
// 2. boolean multiplayer() - This returns true if the sport is multiplayer, else returns false
// 3. boolean teamSport() - This returns true if the sport is a team sport, else returns false
// 4. boolean olympicSport() - This returns true if the sport is an olympicSport, else returns false
// 5. int teamSize() - This returns the team size allowed in the sport. If it is not a team sport, then the value returned is 1
// You have to create the following classes, which extend above abstract classes
// cricket - 
// 1. It is a multiplayer outdoor sport. 
// 2. It is a team sport, it is not an olympic sport, and the team size is 11. 
// - Apart from the inherited functions, you have to add another function 
//    - boolean worldCup() - This function returns true if the world cup happens in the sport or not
// A cricket world cup is held every 4 years 
// tennis - 
// 1. It is not a multiplayer sport
// 2. It is an outdoor sport
// 3. It is not a team sport
// 4. It is an olympic sport
// - Apart from the inherited functions, you have to add another function
//   - boolean grandSlam() - This function returns true if the sport has a grand slam
// - Tennis has a grand slam. 
// You can read more about grand slams in tennishere

// football
// 1. It is a team sport
// 2. It is an outdoor sport
// 3. It is a team sport
// 4. It is an olympic sport
// 5. The team size is 11
// - Apart from the inherited functions, you have to add another function
//    - int numberOfTeams() - This functions returns the number of teams that participate in the football world cup
// - The number of teams participating in the football world cup is 32
// There is no need to take the input or output, just complete the classes as mentioned in the problem statement above

// Input
// There is no need to take the input or output, just complete the classes as mentioned in the problem statement above

// Output
// There is no need to take the input or output, just complete the classes as mentioned in the problem statement above

// Sample Input 1 

// NA
// Sample Output 1

// NA

package conceptofjava;

/*
abstract class sports{
    abstract boolean indoor();
    abstract boolean multiplayer();
    abstract boolean teamSport();
    abstract boolean olympicSport();
    abstract int teamSize();
}
*/
class cricket extends sports {
    // complete the class as mentioned in the problem statement
    boolean indoor() {
        return false;
    }

    boolean multiplayer() {
        return true;
    }

    boolean teamSport() {
        return true;
    }

    boolean olympicSport() {
        return false;
    }

    int teamSize() {
        return 11;
    }

    boolean worldCup() {
        return true;
    }
}

class tennis extends sports {
    // complete the class as mentioned in the problem statement

    boolean indoor() {
        return false;
    }

    boolean multiplayer() {
        return false;
    }

    boolean teamSport() {
        return true;
    }

    boolean olympicSport() {
        return true;
    }

    int teamSize() {
        return 1;
    }

    boolean grandSlam() {
        return true;
    }
}

class football extends sports {
    // complete the class as mentioned in the problem statement
    boolean indoor() {
        return false;
    }

    boolean multiplayer() {
        return true;
    }

    boolean teamSport() {
        return true;
    }

    boolean olympicSport() {
        return true;
    }

    int teamSize() {
        return 11;
    }

    int numberOfTeams() {
        return 32;
    }
}
