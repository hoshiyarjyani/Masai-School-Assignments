// Coffees of the world -7:8:57
// Description

// You have to write a classCoffee, whose description is given as follows

// The class contains the following attributes

// 1. boolean hot;
// 2. boolean creamy;
// 3. boolean chocolateSauce;
// 4. boolean milk;
// 5. boolean high_water_pressure;
// The class contains the following functions
// - boolean mocha() - This function returns true if all the following conditions are true
//     1. the value of hot is true
//     2. the value of creamy is true
//     3. the value of chocolateSauce is false
//     4. the value of milk is true
//     5. the value of high_water_pressure is true
// If any of the above conditions is not met, then the function returns false
// - boolean latte() - This function returns true if all the following conditions are true
//    1. the value of hot is true
//    2. the value of creamy is true
//    3. the value of chocolateSauce is true
//    4. the value of milk is true
//    5. the value of high_water_pressure is true
// If any of the above conditions is not met, then the function returns true
// - boolean espresso() - This functions returns true if all the following conditions are true
//    1. the value of hot is true
//    2. the value of creamy is false
//    3. the value of chocolateSauce is true
//    4. the value of milk is true
//    5. the value of high_water_pressure is false
// If any of the above conditions is not met, then the function returns false
// - boolean frappuccino() - This functions returns if all the following conditions are true
//    1. the value of hot is false
//    2. the value of creamy is true
//    3. the value of chocolateSauce is true
//    4. the value of milk is true
//    5. the value of high_water_pressure is false
// If any of the above conditions is not met, then the function returns false
// All the attributes are passed as parameters to the constructor. Implement the class accordingly

// You don't have to take the input or output. Just complete the class as mentioned in the problem statement above

// Input
// You don't have to take the input or output. Just complete the class as mentioned in the problem statement above

// Output
// You don't have to take the input or output. Just complete the class as mentioned in the problem statement above

// Sample Input 1 

// NA
// Sample Output 1

// NA

package conceptofjava;

public class CoffeeConstructor {
    // complete the class as mentioned in the problem statement
    boolean hot;
    boolean creamy;
    boolean chocolateSauce;
    boolean milk;
    boolean high_water_pressure;

    void offeeConstructor(boolean hot, boolean creamy, boolean chocolateSauce, boolean milk,
            boolean high_water_pressure) {
        this.hot = hot;
        this.creamy = creamy;
        this.chocolateSauce = chocolateSauce;
        this.milk = milk;
        this.high_water_pressure = high_water_pressure;
    }

    boolean mocha() {
        if (hot == true && creamy == true && chocolateSauce == false && milk == true && high_water_pressure == true) {
            return true;
        } else {
            return false;
        }
    }

    boolean latte() {
        if (hot == true && creamy == true && chocolateSauce == true && milk == true && high_water_pressure == true) {
            return true;
        } else {
            return false;
        }
    }

    boolean espresso() {
        if (hot == true && creamy == false && chocolateSauce == true && milk == true && high_water_pressure == false) {
            return true;
        } else {
            return false;
        }
    }

    boolean frappuccino() {
        if (hot == false && creamy == true && chocolateSauce == true && milk == true && high_water_pressure == false) {
            return true;
        } else {
            return false;
        }
    }
}
