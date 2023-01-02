package conceptofjava;

public class CircularQueue {
    // implement the class as mentioned in the problem statement above
    int size;
    int[] arr;
    int front;
    int rear;

    CircularQueue(int size) {
        arr = new int[size];
    }

    boolean enqueue(int data) {
        if (size >= arr.length) {
            return false;
        } else {
            arr[rear] = data;
            rear = (rear + 1) % arr.length;
            size++;
            return true;
        }
    }

    boolean dequeue() {
        if (size == 0) {
            return false;
        } else {
            System.out.println(arr[front]);

            front = (front + 1) % arr.length;
            size--;
            return true;
        }
    }

    int size() {
        return size;
    }
}

// Circular Queue -0:4:51
// Description

// A circular queue is a data structure, which arranges the data inFIFO, that
// isFirst In First Outorder

// It is an abstract Data Structure, which can be implemented with one of the
// primitive data structures, like arrays

// It takes two pointers, front and rear, such that thefrontpoints to the
// current location from which the element is to be removed, whereasrearpoints
// out to the location from which the elements is to be deleted

// The pointers are rotated such that if the current position offront == N-1,
// whereNrefers to the size of the array, the next position of front becomes0,
// same is the case withrearas well

// Apart from the above two variables, the class contains the following
// attributes

// int size; - The maximum elements that we can have in the queue.
// ** This value is passed to the object via the constructor

// int[] arr; - The primitive data structure used
// The class contains two methodsenqueueanddequeue
// - boolean enqueue(int data) -> This function helps to insert value inside the
// queue
// 1. This returns true if the value is successfully inserted into the queue,
// else returns false

// - boolean dequeue() -> This function removes the value at the front of the
// queue, and prints it
// 1. This functions returns false, if the value cannot be removed, else returns
// true

// - int size() - This functions returns the size of the queue, at any given
// moment
// ** The size of the queue is equivalent to the number of elements in the
// stack, at the given instant
// enqueuefunction is used to insert an element into the queue,
// whereasdequeuerefers to removing an element from the queue

// For example, consider the following visual

// N = 4
// front
// |
// array = [_ _ _ _]
// |
// rear
// - enqueue(1), after this the array looks as follows

// front
// |
// array = [1 _ _ _]
// |
// rear
// - enqueue(2), after this the array looks as follows

// front
// |
// array = [1 2 _ _]
// |
// rear

// - enqueue(3), after this the array looks as follows

// front
// |
// array = [1 2 3 _]
// |
// rear

// - enqueue(4), after this the array looks as follows

// front
// |
// array = [1 2 3 4]
// |
// rear

// After this point the queue is full

// - dequeue() - The element removed from the queue will be 1

// After this operation, the array looks as follows
// front
// |
// array = [_ 2 3 4]
// |
// rear
// - enqueue(6), after this the array looks as follows
// front
// |
// array = [6 2 3 4]
// |
// rear

// - dequeue() - The element removed from the queue will be 2

// After this the array looks as follows
// front
// |
// array = [6 _ 3 4]
// |
// rear

// - dequeue() - The element removed from the queue will be 3

// After this the array looks as follows
// front
// |
// array = [6 _ _ 4]
// |
// rear

// - dequeue() - The element removed from the queue will be 4

// After this the array looks as follows
// front
// |
// array = [6 _ _ _]
// |
// rear

// - dequeue() - The element removed from the queue will be 6

// After this the array looks as follows

// front
// |
// array = [_ _ _ _]
// |
// rear

// You are given a classcircular_queue, implement it according to the problem
// statement above

// The size of the array will be passed to the class via constructor

// There's no need to take input or output. Just complete the class as mentioned
// in the problem statement

// Input
// There's no need to take the input or the output. Just implement the class as
// mentioned in the problem statement

// Output
// There's no need to take the input or the output. Just implement the class as
// mentioned in the problem statement

// Sample Input 1

// NA
// Sample Output 1

// The size of the queue is->1
// The size of the queue is->2
// The size of the queue is->3
// The size of the queue is->4
// The size of the queue is->5
// The size of the queue is->5
// 1
// The size of the queue is->4
// 2
// The size of the queue is->3
// 3
// The size of the queue is->2
// 4
// The size of the queue is->1
// 5
// The size of the queue is->0
// The size of the queue is->0