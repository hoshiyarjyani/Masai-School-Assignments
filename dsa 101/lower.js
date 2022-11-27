function lwrCase(str, N) {
  let s = "";
  for (let i = 0; i < N; i++) {
    let x = str.charCodeAt(i);
    if (x >= 65 && x <= 90) {
      s += String.fromCharCode(x + 32);
    }
  }
  console.log(s);
}
let a = "ASDFGH";
lwrCase(a, a.length);
