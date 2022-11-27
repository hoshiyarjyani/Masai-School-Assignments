let str = "HoshiyaR";
let s = "";
for (let i = 0; i < 8; i++) {
  let x = str.charCodeAt(i);
  if (x>= 65 && x <= 90) {
    s +=String.fromCharCode(x+32);
  } else if (str.charCodeAt(i) >= 97 && str.charCodeAt(i) <= 122) {
    s += String.fromCharCode(x-32);
  }
}
console.log(s);


