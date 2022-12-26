function myFun(str) {
  if (str.length == 0) {
    return 0;
  } else {
    str.pop();
    return 1 + myFun(str);
  }
}
let str = ["H", "o", "s", "h", "i", "y", "a", "r"];
let x = myFun(str);
console.log(x);
