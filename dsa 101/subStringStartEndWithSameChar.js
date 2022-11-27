function subStrUnderCond(s) {
  //abcab
  let count = 0;
  for (let i = 0; i < s.length; i++) {
    for (let j = i; j < s.length; j++) {
      if (s[i] == s[j]) {
        count++;
      }
    }
  }
  console.log(count);
}

let s = "abcab";
subStrUnderCond(s);
