type-1
1 word- 

function runProgram(input){
   // Write Code Here
  n=+input;
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
         process.exit(0);
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
     line = 1;
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

