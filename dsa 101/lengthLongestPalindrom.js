let S = "thishjkracecarkjhisgood";
let l = S.length;

for (let i = 0; i < l; i++) {
  for (let j = i + 1; j < l; j++) {
    if (S[i] == S[j]) {
      let len = j - i + 1;
      let mid = Math.floor(len / 2);
      let count = 0;
      for (let k = i, l = j; k < mid + i && l > j - mid; k++, l--) {
        if (S[k] == S[l]) {
          count++;
        } else {
          break;
        }
      }
      if (count == mid) {
        
      }
      
    }else{
        continue;
    }
  }
}
