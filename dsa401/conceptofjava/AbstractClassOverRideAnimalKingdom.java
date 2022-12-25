package conceptofjava;

public class AbstractClassOverRideAnimalKingdom {

    // abstract class Animal{
    // abstract boolean run();
    // abstract boolean swim();
    // abstract boolean crawl();
    // abstract boolean fly();
    // }
    ( COde Start From Here )

    class Tiger extends Animal {
        @Override
        boolean run() {
            return true;
        }

        @Override
        boolean swim() {
            return true;
        }

        @Override
        boolean crawl() {
            return false;
        }

        @Override
        boolean fly() {
            return false;
        }
        // declare and define all the functions that are inherited by this class
    }

    class Snake extends Animal {
        @Override
        boolean run() {
            return false;
        }

        @Override
        boolean swim() {
            return false;
        }

        @Override
        boolean crawl() {
            return true;
        }

        @Override
        boolean fly() {
            return false;
        }
        // declare and define all the functions that are inherited by this class
    }

    class Eagle extends Animal {
        @Override
        boolean run() {
            return false;
        }

        @Override
        boolean swim() {
            return false;
        }

        @Override
        boolean crawl() {
            return false;
        }

        @Override
        boolean fly() {
            return true;
        }
        // declare and define all the functions that are inherited by this class
    }

    class Shark extends Animal {
        @Override
        boolean run() {
            return false;
        }

        @Override
        boolean swim() {
            return true;
        }

        @Override
        boolean crawl() {
            return false;
        }

        @Override
        boolean fly() {
            return false;
        }
        // declare and define all the functions that are inherited by this class
    }

}

// Animal Kingdom Ended
// Description

// You are given an abstract class with the nameAnimalcontaining the following
// methods
// run()
// crawl()
// swim()
// fly()
// The following 4 classes extend the above abstract class. You need to complete
// the above 4 classes, and return the output for each function accordingly

// Input
// The input and the output is managed by the backend. You just need to complete
// the required functions, and return the output according to the return type

// Output
// The input and the output is managed by the backend. You just need to complete
// the required functions, and return the output according to the return type

// Sample Input 1

// NA
// Sample Output 1

// NA