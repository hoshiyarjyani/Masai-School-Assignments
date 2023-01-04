// Compare Numbers 
// Description

// You are given an interfacecomparisonhaving the following functions
// 1. compareMax(a) -> returns the value passed as parameter
// 2. compareMax(a,b) -> returns the maximum value out of the 2 passed as parameter
// 3. compareMax(a,b,c) -> returns the maximum value out of the 3 passed as parameter
// 4. compareMax(a,b,c,d) -> returns the maximum value out of the 4 passed as parameters 
// 5. compareMin(a) -> returns the value passed as parameter
// 6. compareMin(a,b) -> returns the minimum value out of the 2 passed as parameter
// 3. compareMin(a,b,c) -> returns the minimum value out of the 3 passed as parameter
// 4. compareMin(a,b,c,d) -> returns the minimum value out of the 4 passed as parameters 
// You have to implement a class with the namenumberclass, which implements the above interface

// Input
// You don't have to take the input or the output, just implement the given interface using the class given

// Output
// You don't have to take the input or the output, just implement the given interface using the class given

// Sample Input 1 

// 2 3 4 5
// Sample Output 1

// 3
// 4
// 5
// 2
// 2
// 2
// 2
// 2

package conceptofjava;

/*
interface comparison{
  public int comparemax(int a,int b);
  public int comparemax(int a,int b,int c);
  public int comparemax(int a,int b,int c,int d);
  public int comparemax(int a);
  public int comparemin(int a);
  public int comparemin(int a,int b);
  public int comparemin(int a,int b,int c);
  public int comparemin(int a,int b,int c,int d);
}
*/
class numberclass implements comparison {
    // complete the class which implements the comparison class
    public int comparemax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    };

    public int comparemax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    };

    public int comparemax(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > a && b > c && b > d) {
            return b;
        } else if (c > a && c > b && c > d) {
            return c;
        } else {
            return d;
        }
    };

    public int comparemax(int a) {
        return a;
    };

    public int comparemin(int a) {
        return a;
    };

    public int comparemin(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    };

    public int comparemin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    };

    public int comparemin(int a, int b, int c, int d) {
        if (a < b && a < c && a < d) {
            return a;
        } else if (b < a && b < c && b < d) {
            return b;
        } else if (c < a && c < b && c < d) {
            return c;
        } else {
            return d;
        }
    };
}
