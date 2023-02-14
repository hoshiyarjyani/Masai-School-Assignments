// Arrange cars Ended
// Description

// For sure, the love mobiles will roll again on this summer's street parade. Each year, the organisers decide on a fixed order for the decorated trucks. Experience taught them to keep free a side street to be able to bring the trucks into order.

// The side street is so narrow that no two cars can pass each other. Thus, the love mobile that enters the side street last must necessarily leave the side street first. Because the trucks and the ravers move up closely, a truck cannot drive back and re-enter the side street or the approach street.

// You are given the order in which the love mobiles arrive. Write a program that decides if the love mobiles can be brought into the order that the organisers want them to be

// Input
// Input Format
// The first line of the input contains an integer t — the number of test cases.

// The next 2*t lines contain the description of the t testcases.

// The first line of each testcase contains the number of cars n.

// The second line of each testcase contains the n integers from 1 to n in some order.

// Constraints
// 1 ≤ t ≤ 10^4

// 1 ≤ n ≤ 10^3

// Output
// Output Format
// For each testcase output YES if you can arrange the cars in the required order or NO otherwise.

// Sample Input 1 

// 1
// 5
// 5 1 2 4 3
// Sample Output 1

// YES


import java.util.Scanner;
import java.util.Stack;
class UseSideLaneWithStack{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0;i<t;i++){
        int n = sc.nextInt();
        int [] truck = new int[n];
        for(int j = 0;j<n;j++){
            truck[j] = sc.nextInt();
        }
        myFunction(n,truck);
    }
}
// 5 1 2 4 3
public static void myFunction(int n,int [] arr){
    // this stack for the use of side lane of trucks
    Stack<Integer> stk = new Stack<>();
int count = 1;
for(int i = 0;i<n;i++){ //5
    if(arr[i] == count){
        count++;
    }else if(!stk.empty() && stk.peek()==count){
        stk.pop();
        count++;
        i--;
    }else{
        stk.push(arr[i]);
    }
}

for(int i = stk.size()-1;i>=0;i--){
    if(stk.peek()==count){
        stk.pop();
        count++;
    }
}
if(stk.isEmpty()){
    System.out.println("YES");
}else{
    System.out.println("NO");
}


}

}