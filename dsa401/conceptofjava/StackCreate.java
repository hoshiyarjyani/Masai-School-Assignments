package conceptofjava;

//First Approch
public class StackCreate {

    // complete the class as mentioned in the problem statement
    int top;
    int size;
    int[] arr;

    StackCreate(int size) {
        arr = new int[size];
    }

    boolean push(int data) {
        if (size >= arr.length) {
            return false;
        } else {
            arr[size++] = data;
            return true;
        }
    }

    boolean pop() {
        if (size == 0) {
            return false;
        } else {
            System.out.println(arr[--size]);
            return true;
        }
    }

    boolean peek() {
        if (size == 0) {
            return false;
        } else {
            System.out.println(arr[size - 1]);
            return true;
        }
    }

    int size() {
        return size;
    }
}

// Second Approch
class stack {
    int top;
    int size;
    int[] arr;

    stack(int size) {
        arr = new int[size];
        this.top = -1;
        this.size = size;
    }

    boolean push(int data) {
        if (top == size - 1) {
            return false;
        } else {
            arr[++top] = data;
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            return false;
        } else {
            System.out.println(arr[top--]);
            return true;
        }
    }

    boolean peek() {
        if (top == -1) {
            return false;
        } else {
            System.out.println(arr[top]);
            return true;
        }
    }

    int size() {
        return top + 1;
    }

}

// Create your own stack -0:8:29
// Description

// Stack is an abstract data structure, which stores data in the following
// format -LIFO, which stands for Last In First Out

// More precisely, it arranges data such that the last element to go inside the
// data structure, is the first one to come out of it

// You are given a classstack, having the following attributes

// int top; // the variable used to point to the top of the stack
// int size; // denotes the maximum elements that you can store in the stack
// int[] arr // the primitive data structure used to store the elements

// ** The value of size is passed to the object via the constructor, so you will
// have to
// implement the constructor as well
// The class also contains the following functions
// - boolean push(int data) -> This function helps to insert value inside the
// stack
// 1. This returns true if the value is successfully inserted into the stack,
// else returns false

// - boolean pop() -> This function prints the value at the top of the stack
// after removing it
// 1. This functions returns false, if the value cannot be popped out, else
// returns true

// - boolean peek() - This functions prints the value at the top of the stack,
// without removing it
// 1. This function returns true if the operation is successful, else returns
// false

// - int size() - This functions returns the size of the stack, at any given
// moment
// ** The size of the stack is equivalent to the number of elements in the
// stack, at the given instant
// There is no need to take the input or the out, just complete the class as
// mentioned in the problem statement

// Input
// There is no need to take the input or the out, just complete the class as
// mentioned in the problem statement

// Output
// There is no need to take the input or the out, just complete the class as
// mentioned in the problem statement

// Sample Input 1

// NA
// Sample Output 1

// 2
// The value at the top of the stack is->true
// 2
// The value removed from the stack is->true
// 6
// The value removed from the stack is->true
// 5
// The value at the top of the stack is-> true
// 5
// The value removed from the stack is->true
// The size of the stack at this moment is->3
// 4
// The value removed from the stack is->true