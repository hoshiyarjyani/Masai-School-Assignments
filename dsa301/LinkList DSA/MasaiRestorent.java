// Masai Restaurant Ended
// Description

// You love food. Hence, you took up position of a manager at Masai restaurant that serves people with delicious food packages. It is a very famous place and people are always queuing up to have one of those packages. Each package has a cost associated with it. The packages are kept as a pile. The job of a manager is very difficult. You need to handle two types of queries:

// 1) Customer Query:

// When a customer demands a package, the food package on the top of the pile is given and the customer is charged according to the cost of the package. This reduces the height of the pile by 1.

// In case the pile is empty, the customer goes away empty-handed.

// 2) Chef Query:

// The chef prepares a food package and adds it on top of the pile. And reports the cost of the package to the Manager.

// Help him manage the process.

// Input
// Input Format:

// First line contains an integer Q, the number of queries. Next Q lines follow.

// A Type-1 ( Customer) Query, is indicated by a single integer 1 in the line.

// A Type-2 ( Chef) Query, is indicated by two space separated integers 2 and C (cost of the package prepared) .

// Constraints :

// Q<100

// C<1000

// Output
// For each Type-1 Query, output the price that customer has to pay i.e. cost of the package given to the customer in a new line. If the pile is empty, print "No Food" (without quotes).

// Sample Input 1 

// 6
// 1
// 2 5
// 2 7
// 2 9
// 1
// 1
// Sample Output 1

// No Food
// 9
// 7

//===========================BY stack================================

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        while (tc-- > 0) {
            int n = sc.nextInt();
            if (n == 2) {
                stk.push(sc.nextInt());
            } else {
                if (stk.empty()) {
                    System.out.println("No Food");
                } else {
                    System.out.println(stk.pop());
                }
            }
        }
    }
}

// ============================Linklist===================================
class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

    class Stack {
    constructor(){
       this.first = null;
       this.size = 0;
    }

    Push(data){
        let newNode = new Node(data);
        if(!this.first){
            this.first = newNode;
        }else{
            newNode.next=this.first;
            this.first=newNode;
        }
         return ++this.size;
    }

    Pop(){
    if(!this.first){
        return "No Food";
    }
    
    let stk = this.first;
    
    if(this.size===1){
      this.first = null;
      this.size--;
      return stk.data;
    }
     else{
     this.first=this.first.next;
     this.size--;
     return stk.data;
     }
    }
    }

    let S = new Stack();

function stackData(arr){
    if(arr[0]==2){
        S.Push(arr[1]);
    }else{
       console.log(S.Pop());
    }
    
}

function runProgram(input){
   // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  let line = 1;
  for(let i = 0 ; i < tc; i++){
      let arr = input[line].split(" ").map(Number);
      line++;
      stackData(arr);
  }
}
if (process.env.USERNAME === "") {
     runProgram(``);
 } else {
     process.stdin.resume();
     process.stdin.setEncoding("ascii");
     let read = "";
     process.stdin.on("data", function (input) {
         read += input;
     });
     process.stdin.on("end",

    function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });process.on("SIGINT",

    function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
}
