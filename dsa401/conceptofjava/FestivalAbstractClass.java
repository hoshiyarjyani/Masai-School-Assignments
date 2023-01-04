// Festival and classes Ended
// Description

// You are given an abstract classfestivalhaving the following functions
// 1. boolean winter() - This function returns true if the festival is celebrated in winter
// 2. boolean summer() - This function returns true if the festival is celebrated in Summer
// 3. boolean multidays() - This function returns true if the festival lasts for more than 1 day
// 4. boolean panIndia() - This function returns true if the festival is celebrated across India
// You have to create the following classes, which extend the above abstract class
// diwali
// 1. This festival is celebrated in winter
// 2. This festival lasts for multiple days
// 3. This festival is celebrated all across the country
// - Apart from the inherited functions, this class has another function
//    - boolean festivalOfLights() 
//      - This function returns true if the festival is known as the festival of lights

// holi
// 1. This festival is celebrated in summers
// 2. This festival lasts for a single day
// 3. This festival is celebrated all across the country
// - Apart from the inherited functions, this class has another function
//     - festivalOfColors()
//     - This function returns true if the festival is known as the festival of colors
// pongal
// 1. This festival is celebrated in winter
// 2. This festival lasts for a single day
// 3. This festival is celebrated all across the country
// There's no need to take the input or the output. Just implement the classes, according to the explanation in the problem statement

// Input
// - There's no need to take the input or the output. Just implement the classes, according to the explanation in the problem statement

// Output
// - There's no need to take the input or the output. Just implement the classes, according to the explanation in the problem statement

package conceptofjava;

/*
abstract class festival{
    abstract boolean winter();
    abstract boolean summer();
    abstract boolean multidays();
    abstract boolean panIndia();
}
*/
class diwali extends festival {
    // complete the class as mentioned in the problem statement
    boolean winter() {
        return true;
    }

    boolean summer() {
        return false;
    }

    boolean multidays() {
        return true;
    }

    boolean panIndia() {
        return true;
    }

    boolean festivalOfLights() {
        return true;
    }
}

class holi extends festival {
    // complete the class as mentioned in the problem statement
    boolean winter() {
        return false;
    }

    boolean summer() {
        return true;
    }

    boolean multidays() {
        return false;
    }

    boolean panIndia() {
        return true;
    }

    boolean festivalOfColors() {
        return true;
    }
}

class pongal extends festival {
    // complete the class as mentioned in the problem statement above
    boolean winter() {
        return true;
    }

    boolean summer() {
        return false;
    }

    boolean multidays() {
        return false;
    }

    boolean panIndia() {
        return true;
    }
}
