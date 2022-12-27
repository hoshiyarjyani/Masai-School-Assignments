var stk = [1, 2, 3, 4, 5];
function reverse() {
  if (stk.length > 0) {
    var x = stk.pop();
    reverse();
    insert(x);
  }
}
function insert(x) {
  if (stk.length == 0) {
    stk.push(x);
  } else {
    var a = stk.pop();
    insert(x);
    stk.push(a);
  }
}
reverse();
console.log(stk);
