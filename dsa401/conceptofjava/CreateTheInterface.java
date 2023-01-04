// Create the Interface 
// Description

// A class namedorderimplements an interface with the nameArraySum, which was deleted

// Complete the interfaceArraySum, by observing the class implementing it

// Input
// You don't have to take the input or the output, just complete the interface as mentioned in the problem statement

// Output
// You don't have to take the input or the output, just complete the interface as mentioned in the problem statement

// Sample Input 1 

// 5
// 1 2 3 4 5
// Sample Output 1

// 0
// true
// false

package conceptofjava;

/*
class order implements ArraySum{
    public int sum(int[] arr){
        int sum = 0;
        for (Integer i : arr) sum += i;
        return sum;
    }
    public boolean evenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) even++;
            else{
                odd++;
            }
        }
        return even >= odd;
    }
    public boolean oddEven(int[] arr){
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) even++;
            else{
                odd++;
            }
        }
        return even <= odd;
    }
}
*/

interface ArraySum {
    // complete this interface
    public int sum(int[] arr);

    public boolean evenOdd(int[] arr);

    public boolean oddEven(int[] arr);
}
