type-1
1 word- 



function runProgram(input){
   // Write Code Here
  n= +input;
   units(n);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }

type-2
3 0
1 2 3 4 2 1

 function runProgram(input){
   // Write Code Here
   input=input.split("\n");
   line1 = input[0].split(" ").map(Number);
   arr = input[1].split(" ").map(Number);
   N = +line1[0];
   K = +line1[1];
    myFunction(arr,N,K);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }

type 3
12 
1 1 2 3 8 2 4 7 6 5 8 9

 
 function runProgram(input){
   // Write Code Here
   input=input.split("\n");
   N=+input[0];
   arr = input[1].split(" ").map(Number);
   myFunction(N,arr);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);l
     });
 }

type-4
multiple testcase

2
7
mousems
8
wimousee

function runProgram(input){
   // Write Code Here
   input=input.split("\n");
   tc=+input[0];
   line = 1;
   for(let i = 0;i<tc;i++){
       size=+input[line];
       line++;
       str=input[line].split("");
       myfunction(size,str);
       line++;
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }

type-5  multiple test case rectengular metrix 
2
3 2
a a
b b
c c
2 2
a a
b b



function runProgram(input){
   // Write Code Here
   input=input.split("\n");
   tc=+input[0];
     line =  1;
     for(let i = 0; i<tc; i++){
          size = input[line].split(" ").map(Number);
         N = +size[0];
         M = +size[1];
        var arr = [];
         line++;//2
         for(let j = line;j<line+N;j++){
             arr.push(input[j].split(" "));
         }
         line+=N;
         myfunction(N,M,arr);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }






type 6 
Multiple single digit Test cases
Sample Input 1 

3
1
2
100

function runProgram(input){
   // Write Code Here
   input=input.split("\n");
   tc=+input[0];
   line = 1;
   for(let i = 0;i<tc;i++){
       n=+input[line];
       line++;
       myfunction(n);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
       process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
        });
 }





type- 7 
rectangular matrix test cases

Sample Input 1 

2 3
3 1 8
2 6 0



function runProgram(input){
   // Write Code Here
   input=input.split("\n");
          size = input[0].split(" ").map(Number);
         R = +size[0];
         C = +size[1];
        var arr = [];
         
         for(let j = 0;j<R;j++){
             arr.push(input[j+1].split(" "));
         }
         myfunction(R,C,arr);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }






type 8

single string

Sample Input 1 

racecar


function runProgram(input){
   // Write Code Here
  str=input.split("");
  n=str.length;
   myFunction(str,n);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }

type-9 (square matrix)
4
1 2 3 4
5 6 7 8
9 8 7 6
5 4 3 2



function runProgram(input){
   // Write Code Here
   input=input.split("\n");
          N = +input[0];
        var arr = [];
         
         for(let j = 0;j<N;j++){
             arr.push(input[j+1].split(" ").map(Number));
         }
         myfunction(arr,N);
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
     process.stdin.on("end", function () {
         read = read.replace(/\n$/, "");
         read = read.replace(/\n$/, "");
         runProgram(read);
     });
     process.on("SIGINT", function () {
         read = read.replace(/\n$/, "");
         runProgram(read);
         process.exit(0);
     });
 }


