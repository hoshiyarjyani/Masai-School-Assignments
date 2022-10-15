// Category of String Ended
// Description

// You are given a string, whose length is stored in a variable with the nameN

// The string is stored in a variable with the namestr

// The string only contains small case characters, and each character, is given a category such thata = 1, b = 2, c = 3, d = 4, ......, z = 26

// You have to generate a new string, such that each character, is replaced by the value of its category

// For example, consider the value stored instr = abcd, andN = 4

// Now, replacing each character with it's category, we get1234, as the new string, which is the required answer

// Input
// The first line of the input contains the value stored inN

// The next line contains the value stored instr

// Output
// Print the new modified string, as explained in the problem statement

// Sample Input 1

// 4
// abcd
// Sample Output 1

// 1234
// Hint

// In the sample test case, the value stored instr = abcd, andN = 4

// Now, replacing each character with it's category, we get1234, as the new string, which is the required answer
function categoryOfString(N, str) {
  //write code here
  let obj = {
    a: 1,
    b: 2,
    c: 3,
    d: 4,
    e: 5,
    f: 6,
    g: 7,
    h: 8,
    i: 9,
    j: 10,
    k: 11,
    l: 12,
    m: 13,
    n: 14,
    o: 15,
    p: 16,
    q: 17,
    r: 18,
    s: 19,
    t: 20,
    u: 21,
    v: 22,
    w: 23,
    x: 24,
    y: 25,
    z: 26,
  };
  let x = "";
  for (let i = 0; i < N; i++) {
    if (obj[str[i]] != undefined) {
      x += obj[str[i]];
    }
  }
  console.log(x);
}
